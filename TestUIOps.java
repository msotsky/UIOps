/*
Maxime Sotsky 0270251
Data structures I
Assignment 1 pt 2
*/
public class TestUIOps
{
    public static void main(String[] args) // <--- create seperate for operations (UnboundedIntegersOperations.java)
    {

        //(+) + (+) ADDITION
        UnboundedInteger<Integer> myList1 = new UnboundedInteger<Integer>();
        UnboundedInteger<Integer> myList2 = new UnboundedInteger<Integer>();
        myList1 = UnboundedInteger.rep("4538");
        myList2 = UnboundedInteger.rep("909");
        System.out.println(myList1);
        System.out.println(myList2);

        System.out.println("4538 + 909 = +5447");
        int startRemainder = 0;
        UnboundedInteger<Integer> mylist1 = new UnboundedInteger<Integer>();
        System.out.println(UnboundedIntegerOperations.Add(myList1,myList2,mylist1,startRemainder));
        System.out.println("------------------");
//===================================================================================================
        //(+) + (-) SUBTRACTION
        UnboundedInteger<Integer> myList3 = new UnboundedInteger<Integer>();
        UnboundedInteger<Integer> myList4 = new UnboundedInteger<Integer>();
        myList3 = UnboundedInteger.rep("4538");
        myList4 = UnboundedInteger.rep("-909");
        System.out.println(myList3);
        System.out.println(myList4);

        System.out.println("4538 + -909 = +3629");
        UnboundedInteger<Integer> mylist2 = new UnboundedInteger<Integer>();
        System.out.println(UnboundedIntegerOperations.Add(myList3,myList4,mylist2,startRemainder));
        System.out.println("------------------");
//===================================================================================================
        //(-) + (+) SUBTRACTION
        UnboundedInteger<Integer> myList5 = new UnboundedInteger<Integer>();
        UnboundedInteger<Integer> myList6 = new UnboundedInteger<Integer>();
        myList5 = UnboundedInteger.rep("-4538");
        myList6 = UnboundedInteger.rep("909");
        System.out.println(myList5);
        System.out.println(myList6);

        System.out.println("-4538 + 909 = -3629");
        UnboundedInteger<Integer> mylist3 = new UnboundedInteger<Integer>();
        System.out.println(UnboundedIntegerOperations.Add(myList5,myList6,mylist3,startRemainder));
        System.out.println("------------------");
//===================================================================================================
        //(-) + (-) ADDITION
        UnboundedInteger<Integer> myList7 = new UnboundedInteger<Integer>();
        UnboundedInteger<Integer> myList8 = new UnboundedInteger<Integer>();
        myList7 = UnboundedInteger.rep("-4538");
        myList8 = UnboundedInteger.rep("-909");
        System.out.println(myList7);
        System.out.println(myList8);

        System.out.println("-4538 + -909 = -5447");
        UnboundedInteger<Integer> mylist4 = new UnboundedInteger<Integer>();
        System.out.println(UnboundedIntegerOperations.Add(myList7,myList8,mylist4,startRemainder));
        
    }
}

