package money.paid;

import money.user;

import java.util.ArrayList;

public class createBillsPaid extends user {

    ArrayList<Integer> paid = new ArrayList<>();


    protected int getID(String s)
    {
        if(users == null)
        {throw new NullPointerException("there is no user");}

        for(int i = 0; i < numberOfUsers(); i++)
        {
            if(users.get(i).equals(s))
            {
                return i;
            }
        }

        return -1;
    }


    public void storePaid(String s, int a){


        paid.set(getID(s),a);

    }

    protected int total(){

        int total = 0;
        if (users == null){
            throw new NullPointerException("there is no user");
        }

        for (int i = 0; i < paid.size(); i++){
            total = total + paid.get(i);
        }

        return total;

    }

    protected int average(){


        return total()/numberOfUsers();


    }

    protected int whoPaidHowMuch(String s){

        if(getID(s)!=-1)
        return paid.get(getID(s));


        return -1;

    }


}

