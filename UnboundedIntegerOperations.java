/*
Maxime Sotsky 0270251
Data structures I
Assignment 1 pt 2
*/
public class UnboundedIntegerOperations
{
//=======================================UNBOUNDED_INTERGER_OPERATIONS===========================================  
//Looks at sign and determines if theres negatives, turns into subtractions if so
//starts at both ends of list values
//adds values together
//gets modulus 10 of sum
//adds the remainder to the next position of the list moving down 
//if sum was greater than 10 then +1 to next sum
//keeps doing this until one list reaches its sign

//Must be recursive
//method called add that takes 2 unbounded integers as arguments and returns a reference to the final sum

    //UnboundedInteger<Integer> mylist = new UnboundedInteger<Integer>();
    public static UnboundedInteger sign(UnboundedInteger<Integer> num1, UnboundedInteger<Integer> num2, UnboundedInteger<Integer> mylist)
    {
        int data1 = 0;
        int data2 = 0;

        data1 = num1.remove();
        data2 =num2.remove();
        if(data1 == 1 && data2 == 1){
            mylist.add(1);
        }

        else if(data1 == -1 && data2 == -1){
            mylist.add(-1);
        }

        else if(data1 == -1 && data2 == 1){
            
            if(num1.getLength() > num2.getLength()){
                mylist.add(-1);
                sub(num1,num2,mylist,0);
            }
            else{
                mylist.add(1);
                sub(num1,num2,mylist,0);
            }
        }
        else if(data1 == 1 && data2 == -1){
            if(num1.getLength() < num2.getLength()){
                mylist.add(-1);
                sub(num1,num2,mylist,0);
            }
            else{
                mylist.add(1);
                sub(num1,num2,mylist,0);
            }
        }
        return mylist;
    }
    public static UnboundedInteger sub(UnboundedInteger<Integer> num1, UnboundedInteger<Integer> num2, UnboundedInteger<Integer> mylist, int carry)
    {
        int data1 = 0;
        int data2 = 0;
        int remainder = 0;
        if(num2.isEmpty() == true && num1.isEmpty() == true)
            return mylist;
        
        if(num2.isEmpty() == true && num2.getLength() < num1.getLength())
            num2.add(0);

        if(num1.isEmpty() == true && num1.getLength() < num2.getLength())
            num1.add(0);

        data1 = (num1.remove());
        data1 -= carry;
        carry = 0;
        data2 = num2.remove();
        
        if(data1 < data2){
            data1 += 10;
            carry = 1;
        }

        remainder = (data1 - data2);
        mylist.add(remainder);

        sub(num1,num2,mylist,carry);
        return mylist;
    }
    public static UnboundedInteger Add(UnboundedInteger<Integer> num1, UnboundedInteger<Integer> num2, UnboundedInteger<Integer> mylist, int carry)
    {
        int data1 = 0;
        int data2 = 0;
        int remainder = 0;

        if (mylist.getLength() == 0)
            sign(num1, num2, mylist);
        
        
        if(num2.isEmpty() == true && num1.isEmpty() == true)
            return mylist;
    
        if(num2.isEmpty() == true)
            num2.add(0);
    
        if(num1.isEmpty() == true)
            num1.add(0);
        
        data1 = num1.remove();
        data2 = num2.remove();
     
        carry += (data1 + data2);
            
        if(carry < 10){
            mylist.add(carry);
            carry = 0;
        }
        if(carry >= 10){
            remainder = carry % 10;
            mylist.add(remainder);
            carry = 1;
        }
        
        Add(num1,num2,mylist,carry);
        return mylist;
    }
        
    
    
    
}