package hw8;

public class Main {
    public static void main(String[] args){
        MultiSet ms = new MultiSet();
        int value = 1;

        for(int i = 0; i < args[0].length(); i++)
        {
            String key = String.valueOf(args[0].charAt(i));
            value = 0;
            for(int j = 0; j < args[0].length(); j++)
            {
                if (key.equals(String.valueOf(args[0].charAt(j)))){
                    ++value;
                }
            }

            ms.put(key, value);
        }

        System.out.println(ms.toString());   
    }
}