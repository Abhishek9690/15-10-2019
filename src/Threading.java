class Threading extends Thread {
    //run method
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                sleep(500);
                if(i==5){
                    stop();                     //stop method
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Threading obj=new Threading();
        obj.start();// start()
    }
}
