package br.com.example.numbers;

import java.util.Iterator;

/**
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order, and each of their nodes
 * contains a single digit. Add the two numbers and return the sum as a linked
 * list.
 *
 */
public class AddTwoNumbers {

	public static void main(String[] args) {
		var algorithm = new AddTwoNumbers();

	}

	// Solucao de um membor da comunidade 
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		
		if (l2 == null) {
			if (l1.val >= 10) {
				l2 = new ListNode(0);
				l2.next = null;
			} else {
				return l1;
			}

		}

		int temp = l1.val + l2.val;
		l1.val = temp % 10;
		if (temp >= 10) {
			if (l1.next == null) {
				l1.next = new ListNode(1);
			} else {
				l1.next.val++;
			}
		}

		l1.next = addTwoNumbers(l1.next, l2.next);

		return l1;
	}

	public void imprimeResultado(ListNode resultado) {
		String resultadoString = "" + resultado.val;
		ListNode it = resultado;
		while (it.hasNext()) {
			it = it.next;
			resultadoString = resultadoString + it.val;
		}
		System.out.println(resultado);
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

		public boolean hasNext() {
			return this.next != null;
		}
	}

}
