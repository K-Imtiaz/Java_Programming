public static void main(String[] args) {
        System.out.println("Enter number 1 operator and number 2: ");
        Scanner F= new Scanner(System.in);
        double d1=F.nextDouble();
        char OP=F.next().charAt(0);
        double d2=F.nextDouble();


        if(OP=='+') 
        System.out.println((int)(d1+d2));
        else if(OP=='-') 
        System.out.println((int)(d1-d2));
        else if(OP=='/')
        System.out.println((int)(d1/d2));
        else if(OP=='*')
        System.out.println((int)(d1*d2));

    
    }