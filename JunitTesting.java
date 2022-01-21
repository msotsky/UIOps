/*
Maxime Sotsky 0270251
Data structures I
Assignment 1 pt 2
*/
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class JunitTesting {

    @Test
    void addsTwoPostiveUnboudedIntegers() { //tests adding 2 positives
        UnboundedInteger<Integer> myList1 = new UnboundedInteger<Integer>();
        UnboundedInteger<Integer> myList2 = new UnboundedInteger<Integer>();
        UnboundedInteger<Integer> mylist = new UnboundedInteger<Integer>();
        myList1 = UnboundedInteger.rep("4538");
        myList2 = UnboundedInteger.rep("909");
        assertEquals("[1][7][4][4][5]", UnboundedIntegerOperations.Add(myList1, myList2, mylist, 0).toString(), "4538 + 909 = 5774");
    }
    @Test
    void addsNegativeAndPostiveUnboundedIntegers() {
        UnboundedInteger<Integer> myList1 = new UnboundedInteger<Integer>();
        UnboundedInteger<Integer> myList2 = new UnboundedInteger<Integer>();
        UnboundedInteger<Integer> mylist = new UnboundedInteger<Integer>();
        myList1 = UnboundedInteger.rep("4538");
        myList2 = UnboundedInteger.rep("-909");
        assertEquals("[1][9][2][6][3]", UnboundedIntegerOperations.Add(myList1, myList2, mylist, 0).toString(), "4538 + -909 = 3629");
    }
    @Test
    void addsPostiveAndNegativeUnboundedIntegers() {
        UnboundedInteger<Integer> myList1 = new UnboundedInteger<Integer>();
        UnboundedInteger<Integer> myList2 = new UnboundedInteger<Integer>();
        UnboundedInteger<Integer> mylist = new UnboundedInteger<Integer>();
        myList1 = UnboundedInteger.rep("-4538");
        myList2 = UnboundedInteger.rep("909");
        assertEquals("[-1][9][2][6][3]", UnboundedIntegerOperations.Add(myList1, myList2, mylist, 0).toString(), "-4538 + 909 = -3629");
    }
    @Test
    void addsTwoNegativeUnboundedIntegers() {
        UnboundedInteger<Integer> myList1 = new UnboundedInteger<Integer>();
        UnboundedInteger<Integer> myList2 = new UnboundedInteger<Integer>();
        UnboundedInteger<Integer> mylist = new UnboundedInteger<Integer>();
        myList1 = UnboundedInteger.rep("-4538");
        myList2 = UnboundedInteger.rep("-909");
        assertEquals("[-1][7][4][4][5]", UnboundedIntegerOperations.Add(myList1, myList2, mylist, 0).toString(), "-4538 + -909 = -5447");
    }


}
