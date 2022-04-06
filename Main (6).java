class Demo{
    int count=0;
    static int stcount=0; 
    void inc(){ 
        
        count++;
        System.out.println(count);
    }
    static void ince(){
        stcount++;
        System.out.println(stcount);
    }
}

class Main{
    public static void main(String args[]){
        Demo d1[] = new Demo[5];
        for(int i=0;i<5;i++){
            d1[i] = new Demo();
            d1[i].inc(); 
            d1[i].ince();

        }

    }

}


