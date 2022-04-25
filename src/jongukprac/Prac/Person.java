package jongukprac.Prac;

    public class Person{
        private String name;
        private int age;
        private String address;
        private String phone;
        private int type;

        public String getName(){
            return name;
        }
        public void Display(){
            System.out.println("이름 : " + this.name);
            System.out.println("나이 : " + this.age);
            System.out.println("주소 : " + this.address);
            System.out.println("전화번호 : " + this.phone);
            System.out.println("타입 : " + this.type);
            System.out.println("타입이름 : " + this.type);
        }
        public Person(){

        }
        public Person(String name, int age, String address, String phone, int type){
            this.name = name;
            this.age = age;
            this.address = address;
            this. phone = phone;
            this.type = type;
        }
}
