package practice_repo.b103Practice.practice10;

import java.util.Scanner;

public class Q07_Switch_ConvertThreeDigitNumberToWords {
    //Uc haneli bir sayıyı ingilizce okunuşuna çeviren bir kod yazınız.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a three digits number");
        int number = input.nextInt();

        int hundreds = number/100;
        int tens = (number/10)%10;
        int ones = number%10;

        if(hundreds==0){
            System.out.println("Enter a three digits number");

        }else {

            switch (hundreds){
                case 1  :{
                    System.out.println("one");
                    break;
                }
                case 2  :{
                    System.out.println("two");
                    break;
                }
                case 3  :{
                    System.out.println("three");
                    break;
                }
                case 4  :{
                    System.out.println("four");
                    break;
                }
                case 5  :{
                    System.out.println("five");
                    break;
                }
                case 6  :{
                    System.out.println("six");
                    break;
                }
                case 7  :{
                    System.out.println("seven");
                    break;
                }
                case 8  :{
                    System.out.println("eight");
                    break;
                }
                case 9  :{
                    System.out.println("nine");
                    break;
                }


            }
            System.out.println("hundred");

            if(tens==1){
                switch (ones){
                    case 0:{
                        System.out.println("ten");
                        break;
                    }
                    case 1:{
                        System.out.println("eleven");
                        break;
                    }
                    case 2:{
                        System.out.println("twelve");
                        break;
                    }
                    case 3:{
                        System.out.println("thirteen");
                        break;
                    }
                    case 4:{
                        System.out.println("fourteen");
                        break;
                    }
                    case 5:{
                        System.out.println("fifteen");
                        break;
                    }
                    case 6:{
                        System.out.println("sixteen");
                        break;
                    }
                    case 7:{
                        System.out.println("sevebteen");
                        break;
                    }
                    case 8:{
                        System.out.println("eighteen");
                        break;
                    }
                    case 9:{
                        System.out.println("ninteen");
                        break;
                    }

                }

            }else {
                switch (tens){
                    case 2:{
                        System.out.println("twenty");
                        break;
                    }
                    case 3:{
                        System.out.println("thirty");
                        break;
                    }
                    case 4:{
                        System.out.println("fourty");
                        break;
                    }
                    case 5:{
                        System.out.println("fifty");
                        break;
                    }
                    case 6:{
                        System.out.println("sixty");
                        break;
                    }
                    case 7:{
                        System.out.println("seventy");
                        break;
                    }
                    case 8:{
                        System.out.println("eighty");
                        break;
                    }
                    case 9:{
                        System.out.println("ninety");
                        break;
                    }
                    case 0:{

                        break;
                    }
                }
                switch (ones){
                    case 0: {
                        break;
                    }
                    case 1  :{
                        System.out.println("one");
                        break;
                    }
                    case 2  :{
                        System.out.println("two");
                        break;
                    }
                    case 3  :{
                        System.out.println("three");
                        break;
                    }
                    case 4  :{
                        System.out.println("four");
                        break;
                    }
                    case 5  :{
                        System.out.println("five");
                        break;
                    }
                    case 6  :{
                        System.out.println("six");
                        break;
                    }
                    case 7  :{
                        System.out.println("seven");
                        break;
                    }
                    case 8  :{
                        System.out.println("eight");
                        break;
                    }
                    case 9  :{
                        System.out.println("nine");
                        break;
                    }
                }
            }
        }
    }
}
