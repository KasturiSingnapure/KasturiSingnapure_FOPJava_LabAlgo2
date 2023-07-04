package com.greatlearning.CurrencyNote;

public class MergeSort {
	public void sort(int arr[], int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			sort(arr, left, mid);
			sort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}

	private void merge(int arr[], int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		int L[] = new int[n1];
		int R[] = new int[n2];

		// Copy elements to temporary arrays
		for (int i = 0; i < n1; i++)
			L[i] = arr[left + i];
		for (int j = 0; j < n2; j++)
			R[j] = arr[mid + 1 + j];

		int i = 0, j = 0, k = left;
		// Merge the temporary arrays back into the original array
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		// Copy the remaining elements of L[], if any
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		// Copy the remaining elements of R[], if any
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
}