public class Main{
    public static void main(String[] args){
        tugasQ<String> queue = new tugasQ<>();

        //menambahkan tugas
        queue.tambahTugas("Jurnal 05 ISD");
        queue.tambahTugas("Kuis SBD");
        queue.tambahTugas("Tugas Besar");

        System.out.println("Tugas saat ini");
        queue.urutanTugas();
        System.out.println();

        queue.selesaiTugas();
        System.out.println("Tugas Pertama selesai");
        queue.urutanTugas();
    }
}