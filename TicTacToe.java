//tic tac toe game
/*  PRINT BOARD
    |_0_|_1_|_2_|
    |_3_|_4_|_5_|
    |_6_|_7_|_8_|
 */

import java.util.Scanner;

public class TicTacToe 
{
    static Scanner in = new Scanner(System.in);
    static char[] a={'0','1','2','3','4','5','6','7','8'};
    static int count=0;
    static int assigned=1;
    static int pos1;
    static int pos2;

    //1. to print the pattern
    static void pattern()
    {
        System.out.println("|_"+a[0]+"_|_"+a[1]+"_|_"+a[2]+"_|");
        System.out.println("|_"+a[3]+"_|_"+a[4]+"_|_"+a[5]+"_|");
        System.out.println("|_"+a[6]+"_|_"+a[7]+"_|_"+a[8]+"_|");   
    }

    //2. to assign at particular index
    static void play(int plyr, int posno)
    {
        char c=' ';
        if(plyr==1)
        {
            c='x';
        }
        else
        {
            c='o';
        }

        switch(posno)
        {
            case 0:
                if(isEmpty(posno))
                {
                    a[posno]=c;
                    assigned++;
                }
                else
                {
                    System.out.println("This slot is already ocuupied");
                    turn();
                }
                break;

            case 1:
                if(isEmpty(posno))
                {
                    a[posno]=c;
                    assigned++; 
                }
                else
                {
                    System.out.println("This slot is already ocuupied");
                    turn();
                }
                break;

            case 2:
                if(isEmpty(posno))
                {
                    a[posno]=c;
                    assigned++; 
                }
                else
                {
                    System.out.println("This slot is already ocuupied");
                    turn();
                }
                break;

            case 3:
                if(isEmpty(posno))
                {
                    a[posno]=c;
                    assigned++; 
                }
                else
                {
                    System.out.println("This slot is already ocuupied");
                    turn();
                }
                break;

            case 4:
                if(isEmpty(posno))
                {
                    a[posno]=c;
                    assigned++; 
                }
                else
                {
                    System.out.println("This slot is already ocuupied");
                    turn();
                }
                break;

            case 5:
                if(isEmpty(posno))
                {
                    a[posno]=c;
                    assigned++;
                }
                else
                {
                    System.out.println("This slot is already ocuupied");
                    turn();
                }
                break;

            case 6:
                if(isEmpty(posno))
                {
                    a[posno]=c;
                    assigned++;
                }
                else
                {
                    System.out.println("This slot is already ocuupied");
                    turn();
                }
                break;

            case 7:
                if(isEmpty(posno))
                {
                    a[posno]=c;
                    assigned++;
                }
                else
                {
                    System.out.println("This slot is already ocuupied");
                    turn();
                }
                break;

            case 8:
                if(isEmpty(posno))
                {
                    a[posno]=c;
                    assigned++;
                }
                else
                {
                    System.out.println("This slot is already ocuupied");
                    turn();
                }
                break;

            default:
                System.out.println("Invalid index number");
                turn();
        }
    }

    //3. to check whose turn it is
    static void turn()
    {
        while(true)
        {
            if(assigned%2==0 )
            {
                System.out.println("Player2's turn! Enter the position at which u would like to store o:- ");
                int temp=in.nextInt();
                if(temp>=0 && temp<=8)
                {
                    pos2=temp;
                    play(2, temp);
                    break;
                }
            }
            else
            {
                System.out.println("Player1's turn! Enter the position at which u would like to store x:- ");
                int temp=in.nextInt();
                if(temp>=0 && temp<=8)
                {
                    pos1=temp;
                    play(1, temp);
                    break;
                }
            }
        }
    }
    
    //4. to check whether the position is empty or not
    static boolean isEmpty(int position)
    {
        if(a[position]=='x' || a[position]=='o')
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    //5. to check which player won the game
    static void win(int plyr)
    {
        System.out.println("WINNER is player "+plyr);
    }

    //6.to check if match is found
    static void logic()
    {
        int y=-1;

        if(a[0]=='x' && a[1]=='x' && a[2]=='x' ||
           a[3]=='x' && a[4]=='x' && a[5]=='x' ||
           a[6]=='x' && a[7]=='x' && a[8]=='x' ||
           a[0]=='x' && a[3]=='x' && a[6]=='x' ||
           a[1]=='x' && a[4]=='x' && a[7]=='x' ||
           a[2]=='x' && a[5]=='x' && a[8]=='x' ||
           a[0]=='x' && a[4]=='x' && a[8]=='x' ||
           a[2]=='x' && a[4]=='x' && a[6]=='x')
        {
            count=1;
            win(1);
        }
        else if(a[0]=='o' && a[1]=='o' && a[2]=='o' ||
                a[3]=='o' && a[4]=='o' && a[5]=='o' ||
                a[6]=='o' && a[7]=='o' && a[8]=='o' ||
                a[0]=='o' && a[3]=='o' && a[6]=='o' ||
                a[1]=='o' && a[4]=='o' && a[7]=='o' ||
                a[2]=='o' && a[5]=='o' && a[8]=='o' ||
                a[0]=='o' && a[4]=='o' && a[8]=='o' ||
                a[2]=='o' && a[4]=='o' && a[6]=='o')
        {
            count=1;
            win(2);
        }
        else
        {
            for(int i=0; i<a.length; i++)
            {
                if(a[i]=='x' || a[i]=='o')
                {
                    y++;
                }
            }
            if(y>=7)
            {
                System.out.println("It's a draw ");
                count=1;
            }
        }
    }

    public static void main(String[] args) 
    {
        pattern();
        System.out.println("Player 1:- x");
        System.out.println("Player 2:- o");

        while(true)
        {
            System.out.println("Player1's turn! Enter the position at which u would like to store x:- ");
            pos1=in.nextInt();
            play(1, pos1);
            pattern();
            logic();
            if(count==1)
            {
                break;
            }


            System.out.println("Player2's turn! Enter the position at which u would like to store o:- ");
            pos2=in.nextInt();
            play(2, pos2);
            pattern();
            logic();
            if(count==1)
            {
                break;
            }
        }
    }     
}