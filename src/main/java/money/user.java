package money;

import java.util.ArrayList;
import java.util.Scanner;

public class user {

    public ArrayList<String> users = new ArrayList<>();

    /**
     *
     * @param s the name of the people u want to add
     */
    public void addUser(String s){
        users.add(s);
    }

    /**
     *
     * @return how many names there are
     */
    public int numberOfUsers(){
        if (users == null) return 0;
        return users.size();
    }


    /**
     *
     * @param name the name u want to delete from the list
     */
    public void removeUser(String name){

            for(int i = 0; i< users.size(); i++)
            {
                if(users.get(i).equals(name))
                {
                    users.remove(i);
                }
            }
    }

    public boolean isEmpty(){

        return users.isEmpty();

    }




}
