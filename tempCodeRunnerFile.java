class practice{
    public static void main(String args[]){
        StringBuilder name= new StringBuilder("Prince");
        System.out.println(name);
        System.out.println(name.charAt(4));
        //insert function
        name.insert(0,'S');
        System.out.println(name);
        name.insert(4,'B');
        System.out.println(name);
    }
}
