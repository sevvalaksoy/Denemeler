package com.workintech.example;

class StudentRank{
    private String[] students;
    private int[] ranks;

    public StudentRank(String[] students, int[] ranks){
        this.students = students;
        this.ranks = ranks;
    }

    public String highestRank(){
        int index = 0;
        for ( int i = 0; i < ranks.length; i++){
            if (ranks[i] > ranks[index]){
                index = i;
            }
        }
        return students[index];
    }
    public String lowestRank(){
        int index = 0;
        for ( int i = 0; i < ranks.length; i++){
            if (ranks[i] < ranks[index]){
                index = i;
            }
        }
        return students[index];
    }

}

class Main {
    public static void main(String[] args) {
        String[] st = {"Alex", "Chris", "Sam"};
        int[] rk = {3,1,2};
        StudentRank sr = new StudentRank(st, rk);
        System.out.println(sr.highestRank());
        System.out.println(sr.lowestRank());

    }
}
