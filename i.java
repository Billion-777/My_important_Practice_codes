import java.util.*;

public class i {

    public static void main(String[] args) {
        // int a[] = new int[20];
        // int rem=0,cap=4,recv,sent,rate=3;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the packet size");
        // int n= sc.nextInt();
        // System.out.println("Enter the packets");
        // for(int i=1; i<=n;i++)
        // a[i] = sc.nextInt();
        // System.out.println("Clock\tPackets size\tsent\taccept\t remainng");
        // for(int i=1;i<=n;i++)
        // {
        // if(a[i]!=0)
        // {
        // if (rem+a[i]>cap)

        // recv =-1;
        // else {
        // recv = a[i];
        // rem = rem+a[i];

        // }

        // }
        // else
        // recv = 0;
        // if(rem!=0)
        // {
        // if (rem<rate)
        // {
        // sent = rem;
        // rem = 0;

        // }
        // else{
        // sent = rate;
        // rem = rem-rate;

        // }
        // }
        // else
        // sent=0;
        // if(recv==-1)
        // {
        // System.out.println(i+"\t\t"+a[i]+"\t\t"+ "\tdropped\t" + sent +"\t"+rem);}
        // else{
        // System.out.println(i+"\t\t"+a[i]+"\t\t"+ recv+ "\t" + sent +"\t"+rem); }
        // }
        // }
        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Message Bits");
        String Message = sc.nextLine();
        System.out.println("Enter the Generator Bits");
        String gen = sc.nextLine();
        int data[] = new int[Message.length() + gen.length() - 1];
        int div[] = new int[gen.length()];
        for (int i = 0; i < Message.length(); i++)
            data[i] = Integer.parseInt(Message.charAt(i) + "");
        for (int i = 0; i < gen.length(); i++)
            div[i] = Integer.parseInt(gen.charAt(i) + "");
        for (int i = 0; i < Message.length(); i++)

        {
            if (data[i] == 1) {
                for (int j = 0; j < div.length; j++)
                    data[i + j] ^= div[j];
            }
        }
        System.out.println("The CheckSum code is");
        for (int i = 0; i < Message.length(); i++)
            data[i] = Integer.parseInt(Message.charAt(i) + " ");
        for (int i = 0; i < data.length; i++)
            System.out.println(data[i]);
        System.out.println();
        System.out.println("Enter the CheckSum Code");
        Message = sc.nextLine();
        System.out.println("Enter the generator Code");
        gen = sc.nextLine();
        data = new int[Message.length() + gen.length() - 1];
        div = new int[gen.length()];
        for (int i = 0; i < Message.length(); i++)
            data[i] = Integer.parseInt(Message.charAt(i) + "");
        for (int i = 0; i < gen.length(); i++)
            div[i] = Integer.parseInt(gen.charAt(i) + "");
        for (int i = 0; i < Message.length(); i++)

        {
            if (data[i] == 1) {
                for (int j = 0; j < div.length; j++)
                    data[i + j] ^= div[j];
            }
        }
        boolean valid = true;
        for (int i = 0; i < data.length; i++)
            if (data[i] == 1)

            {
                valid = false;
                break;

            }

        if (valid == true) {
            System.out.println("Data Stream is Valid");
        } else {
            System.out.println("Data Stream is inValid");
        }

    }
}
