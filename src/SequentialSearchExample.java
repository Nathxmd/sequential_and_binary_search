public class SequentialSearchExample { 
    // membuat sequential search
    public static int sequentialSearch(int[] arr, int target) {
    // iterasi melalui seluruh array
    for (int i = 0; i < arr.length; i++) {
        // jika target ditemukan, maka return index
        if (arr[i] == target) {
            return i;
        }   
    }
    // jika target tidak ditemukan, maka return -1
    return -1;
    }

    public static void main(String[] args) {
        // data array
        int[] arr = {2, 4, 6, 8, 10};
        // target
        int target = 12;
        // panggil method sequentialsearch
        int hasilPencarian = sequentialSearch(arr, target);
        // tampilkan hasil pencarian
        if (hasilPencarian != -1) {
            System.out.println("angka " + target + " ditemukan pada indeks ke-" + hasilPencarian);
        } else {
            System.out.println("angka " + target + " tidak ditemukan dalam array");
        }
    }
}
