import java.util.Scanner;
public class Mixed {
    public static void main(String[] args){
        System.out.println("!!!!!Welcome to Ban1's program!!!!!\nWe program have many method for you!");
        System.out.println("1.Prime Number          Press: 1");
        System.out.println("2.Percentage            Press: 2");
        System.out.println("3.Slope And Distance    Press: 3");
        System.out.println("4.Circle                Press: 4");
        System.out.println("5.Pythagoras            Press: 5");
        System.out.println("6.Factorial             Press: 6");
        System.out.println("7.Convert               Press: 7");
        System.out.println("8.Fibonacci             Press: 8");
        System.out.println("9.All Quadrilateral     Press: 9");
        System.out.println("10.Cylindrical          Press: 10");
        System.out.println("11.Triangle             Press: 11");
        Scanner sc = new Scanner(System.in);
        System.out.print("Press Number: ");
        int number = sc.nextInt();

        switch(number){
            case 1:
                PrimeNumber();
                break;
            case 2:
                Percentage();
                break;
            case 3:
                SlopeAndDistance();
                break;
            case 4:
                Circle();
                break;
            case 5:
                Pythagoras();
                break;
            case 6:
                Factorial();
                break;
            case 7:
                Convert();
                break;
            case 8:
                Fibonacci();
                break;
            case 9:
                All_quadrilateral();
                break;
            case 10:
                Cylindrical();
                break;
            case 11:
                Triangle();
                break;
            default:
                System.out.println("Please, Check your number again.");
            sc.close();
        }
    }
    static void PrimeNumber(){
        System.out.println("Welcome to Prime number");
        System.out.println("This program is to send output that how many prime number in number that you type");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        System.out.println("So your number is "+number);
        System.out.println("I will send output:");
        int prime_number = 0;
        int start = 2;
        while (start <= number){
            int divide = 2;
            while (divide <= start/divide){
                if (start % divide == 0){
                    break;
                }divide += 1;
            }
            if (divide > start/divide){
                System.out.print(start+" ");
                prime_number = start;
            }
            start += 1;
        }
        System.out.println();
        if (prime_number == number){
            System.out.println("Yes " + number + " is prime number");
        }
        if (prime_number != number){
            System.out.println("No " + number + " is not prime number");
        }
        input.close();
    }
    static void Percentage(){
        Scanner input = new Scanner(System.in);
        double obtainedScore=0, totalScore=0;
        float percentage;
        System.out.print("Enter obtained score: ");
        obtainedScore = input.nextDouble();
        System.out.print("Enter total score: ");
        totalScore = input.nextDouble();

        percentage = (float) ((obtainedScore*100)/totalScore);

        System.out.println("Percentage is: "+percentage+"%");
        input.close();
    }
    static void SlopeAndDistance(){
        System.out.println("What do you want to use metod?");
        System.out.println("Slope metod     Press 1");
        System.out.println("Distance metod  Press 2");
        Scanner sc = new Scanner(System.in);
        System.out.print("Press number: ");
        int number = sc.nextInt();

        switch(number){
            case 1:
                slope();
                break;
            case 2:
                distance();
                break;
        }
        sc.close();
    }
    static void slope(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Y2:");
        double Y2 = sc.nextDouble();
        System.out.print("Enter Y1:");
        double Y1 = sc.nextDouble();
        System.out.print("Enter X2:");
        double X2 = sc.nextDouble();
        System.out.print("Enter X1:");
        double X1 = sc.nextDouble();

        double m = (Y2-Y1)/(X2-X1);
        System.out.println("Your slope is "+m);
        sc.close();
    }
    static void distance(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A:");
        double A = sc.nextDouble();
        System.out.print("Enter B:");
        double B = sc.nextDouble();
        System.out.print("Enter C:");
        double C = sc.nextDouble();
        System.out.print("Enter X:");
        double X = sc.nextDouble();
        System.out.print("Enter Y:");
        double Y = sc.nextDouble();

        double d = (Math.abs((A*X)+(B*Y)+C))/(Math.sqrt((Math.pow(A, 2))+(Math.pow(B, 2))));
        System.out.println("Your distance is "+d);
        sc.close();
    }
    static void Circle(){
        double r=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Find circle area type : 1 ");
        System.out.println("Find circumference type : 2 \n");

        System.out.print("Area / Circumference : ");
        double s = sc.nextInt();

        if(s == 1 || s==2){
            System.out.print("Input radius : ");
            r = sc.nextDouble();
        }
        else if(s!=1||s!=2){
            System.out.print("\nERROR");
        }

        double area = 3.14159265 * r * r;
        double circumference = 2 * 3.14159265 * r;

        if(s == 1){
            System.out.println("\nArea of Circle = "+area);
        }
        else if (s == 2){
            System.out.println("\nCircumference of Circle = "+circumference);
        }
        sc.close();
    }
    static void Pythagoras(){
        Scanner n = new Scanner(System.in);
        System.out.print("*WARNING DONT FORGET TO SET THE VARIABLE THAT YOU WANT TO FIND TO 0*");
        System.out.print("\n Enter your number = ");
        int a = n.nextInt();
        int b = n.nextInt();
        int c = n.nextInt();

        if (a == 0)
            {
            a = (c*c)-(b*b);
            System.out.print(Math.sqrt(a));
            }
        else if (b == 0)
            {
            b = (c*c)-(a*a);
            System.out.print(Math.sqrt(b));
            }
        else if (c == 0)
            {
            c = (a*a)+(b*b);
            System.out.print(Math.sqrt(c));
            }
        else
            {
                System.out.print("ERROR!! (YOU MIGHT FORGET TO SET THE NUMBER THAT YOU WANT TO FIND TO 0 OR SOMETHING)");
            }
        n.close();
    }
    static void Factorial(){
        Scanner n = new Scanner(System.in);
        System.out.print("*WARNING THE LIMIT OF NUMBER IS 20 AND NUMBER MUST BE MORE THAN 0");
        System.out.print("\nEnter your number = ");
        int number = n.nextInt();

        int factorial = 1;

        if (number > 20) {
            System.out.print("YOUR NUMBER IS TOO MUCH!");
        }
        else if (number < 0) {
            System.out.print("YOUR NUMBER MUST BE MORE THAN ZERO!!!");
        }
        else {
            for (int i = number; i >= 1; i--) {
                factorial *= i;
            }
            System.out.print(factorial);
        }
        n.close();
    }
    static void Convert(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" =============================");
        System.out.println("1| Convert cm -> mm           |");
        System.out.println("2| Convert m - > mm           |");
        System.out.println("3| Convert mm -> cm           |");
        System.out.println("4| Convert m  -> cm           |");
        System.out.println("5| Convert mm -> m            |");
        System.out.println("6| Convert cm -> m            |");
        System.out.println(" ============================= ");


        int choice = sc.nextInt();
        double num, ans;
        switch(choice){
            case 1:
                System.out.print("Enter number  cm -> mm : ");
                num = sc.nextDouble();
                if(num > 0){
                    ans = num*10;
                    System.out.println(num + " cm is "+ ans+ " cm");
                }
                else{
                    System.out.println("Please check your number if that number is more than zero!");
                }
                break;
            case 2:
                System.out.print("Enter number m -> mm : ");
                num = sc.nextDouble();
                if(num > 0){
                    ans = num*1000;
                    System.out.println(num + " m is "+ ans+ " mm");
                }
                else{
                    System.out.println("Please check your number if that number is more than zero!");
                }
                break;
            case 3:
                System.out.print("Enter number mm -> cm : ");
                num = sc.nextDouble();
                if(num > 0){
                    ans = num/10;
                    System.out.println(num + " mm is "+ ans+ " cm");
                }
                else{
                    System.out.println("Please check your number if that number is more than zero!");
                }
                break;
            case 4:
                System.out.print("Enter number m  -> cm : ");
                num = sc.nextDouble();
                if(num > 0){
                ans = num*100;
                System.out.println(num + " m is "+ ans+ " cm");
                }
                else{
                    System.out.println("Please check your number if that number is more than zero!");
                }
                break;
            case 5:
                System.out.print("Enter number  mm -> m : ");
                num = sc.nextDouble();
                if(num > 0){
                    ans = num/1000;
                    System.out.println(num + " mm is "+ ans+ " m");
                }
                else{
                    System.out.println("Please check your number if that number is more than zero!");
                }    
                break;
            case 6:
                System.out.print("Enter number  cm -> m : ");
                num = sc.nextDouble();
                if(num > 0){
                    ans = num/100;
                    System.out.println(num + " cm is "+ ans+ " m");
                }
                else{
                    System.out.println("Please check your number if that number is more than zero!");
                }
                break;
        }
        sc.close();
    }
    static void Fibonacci(){
        Scanner sc = new Scanner(System.in);
        System.out.println("FIBONACCI FUNCTION");
        System.out.println("==============================================");
        System.out.print("How many Series do you want: ");
        int num = sc.nextInt();
        num = num -2;
        if(num>2){
            System.out.println("Fibonacci of " + (num+2));
            System.out.print(0 +" " +  1);
            fibonacci(num);
        }
        else{
            System.out.println("Please check your number if that number is more than two!");
        }
        sc.close();
    }
    static void fibonacci(int i) {
        long first = 0;
        long second = 1;
        long fibonac;
        long b = 0;
        while (b < i) {
            fibonac = first + second;
            first = second;
            second = fibonac;

            System.out.print(" " + fibonac);
            b++;
        }
    }
    static void All_quadrilateral(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter kind of quadrilateral (square,rectangle,rhombus,parallelogram,kite,trapezium,trapezoid): ");
        
        String q = sc.next();
        switch (q) {
            case "square":
                System.out.print("Choose 'side' or 'diagonals' => ");
                String choicerq = sc.next();
                if (choicerq.equals("side")) {
                        System.out.print("side = ");
                        double sq2 = sc.nextDouble();
                        sq2 *= sq2;
                        System.out.println("area of square = " + sq2);
                } else if (choicerq.equals("diagonals")) {
                        System.out.print("diagonals = ");
                        double sq4 = sc.nextDouble();
                        sq4 = 1 * sq4 * sq4 / 2;
                        System.out.println("area of square = " + sq4);
                } else {
                    System.out.println("Error\ntry again");
                }
                break;

                case "rectangle":
                    System.out.print("width => ");
                    double width = sc.nextDouble();
                    System.out.print("length => ");
                    double length = sc.nextDouble();
                    System.out.println("area of rectangle = " + width * length);
                    break;

                case "rhombus":
                    System.out.print("Choose 'base-high' or 'diagonals' => ");
                    String choicerh = sc.next();
                    if (choicerh.equals("base-high")) {
                        System.out.print("base => ");
                        double base = sc.nextDouble();
                        System.out.print("high => ");
                        double high = sc.nextDouble();
                        System.out.println("area of rhombus = " + base * high);
                    } else if (choicerh.equals("diagonals")) {
                        System.out.print("diagonals = ");
                        double rh4 = sc.nextDouble();
                        rh4 = 1 * rh4 * rh4 / 2;
                        System.out.println("area of rhombus = " + rh4);
                    } else {
                        System.out.println("Error\ntry again");
                    }
                    break;

                case "parallelogram":
                    System.out.print("base => ");
                    double base = sc.nextDouble();
                    System.out.print("high => ");
                    double high = sc.nextDouble();
                    System.out.println("area of parallelogram = " + base * high);
                    break;

                case "kite":
                    System.out.print("diagonals = ");
                    double k1 = sc.nextDouble();
                    k1 = 1 * k1 * k1 / 2;
                    System.out.println("area of kite = " + k1);
                    break;

                case "trapezium":
                    System.out.print("parallel side = ");
                    double parallel_side = sc.nextDouble();
                    System.out.print("high = ");
                    double hightr = sc.nextDouble();
                    parallel_side += parallel_side;
                    double trd2 = parallel_side * hightr / 2;
                    System.out.println("area of trapezium = " + trd2);
                    break;

                case "trapezoid":
                    System.out.print("diagonals = ");
                    double diagonals = sc.nextDouble();
                    System.out.print("branch line = ");
                    double branch_line = sc.nextDouble();
                    branch_line += branch_line;
                    double trz2 = diagonals * branch_line / 2;
                    System.out.println("area of trapezoid = " + trz2);
                    break;

                default:
                    System.out.println("ERROR\ntry again");
        }
        sc.close();
    }
    static void Cylindrical(){
        double r=0;
        double h=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input radius : ");
        r = sc.nextDouble();

        System.out.print("Input high : ");
        h = sc.nextDouble();
        if(r > 0 && h > 0){
            double volume = 3.14159265 * r * r * h;
            System.out.println("\nArea of Cylindrical = "+volume);
        }
        else{
            System.out.println("Please check your number if that number is more than zero!");
        }

        sc.close();
    }
    static void Triangle(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the Triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the Triangle: ");
        double height = scanner.nextDouble();

        //Area = (widthheight)/2
        if(base > 0 && height > 0){
            double area = (base*height)/2;
            System.out.println("Area of Triangle is " + area);
        }
        else{
            System.out.println("Please check your number if that number is more than zero!");
        }
        scanner.close();
    }
}


