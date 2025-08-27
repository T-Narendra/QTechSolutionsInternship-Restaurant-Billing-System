package QTechSolutionsProjects.Project4;

import java.util.*;

public class RestuarantBillingSystem {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<String> orderedItems=new ArrayList<>();
        Map<String,Integer> menu= new LinkedHashMap<>();
        menu.put("Meals",100);
        menu.put("Panner Biryani",269);
        menu.put("Mushroom Biryani",279);
        menu.put("Chicken Biryani",299);
        menu.put("Chicken Fry Piece Biryani",319);
        menu.put("Mutton Biryani",349);
        menu.put("Prawns Biryani",329);
        menu.put("Fish Biryani",309);

        ArrayList<String> items=new ArrayList<>(menu.keySet());
        ArrayList<Integer> price=new ArrayList<>(menu.values());
        int amount=0;

        System.out.println("==========Welcome to Biryani House==========");
        while(true){
            System.out.println("1.View Menu");
            System.out.println("2.Order items");
            System.out.println("3.View ordered items");
            System.out.println("4.Bill");
            System.out.println("5.Exit");
            System.out.println("------------------------------");
            System.out.println("Enter Your choice:");
            int choice=s.nextInt();

            switch(choice){
                case 1:
                    for(int i=0;i<items.size();i++){
                        System.out.println(i+1+"."+ items.get(i)+ "-"+ "Rs."+price.get(i));
                    }
                    System.out.println("==============================");
                    break;

                case 2:
                    System.out.println("Enter item number:");
                    int itemNo=s.nextInt();
                    String item=items.get(itemNo-1);
                    orderedItems.add(item+"-"+"Rs."+menu.get(item));
                    amount+=menu.get(item);
                    System.out.println("==============================");
                    break;
            
                case 3:
                    System.out.println("--------you ordered Items--------");
                    if(!orderedItems.isEmpty()){
                        for(int i=0;i<orderedItems.size();i++){
                            System.out.println(i+1+"."+orderedItems.get(i));
                        }
                    }
                    else{
                        System.out.println("Empty");
                    }
                    System.out.println("==============================");
                    break;

                case 4:
                    System.out.println("======Bill======");
                    for(int i=0;i< orderedItems.size();i++){
                        System.out.println(i+1+"."+orderedItems.get(i));
                    }
                    double totalAmount=amount+amount*0.1;
                    System.out.println("amount:"+amount);
                    System.out.println("Taxes:"+amount*0.1);
                    System.out.println("Total Amount:"+totalAmount);
                    System.out.println("==============================");
                    break;
                    
                case 5:
                    System.out.println("-----------Thank You Visit again----------");
                    return;
            }
        }
    }
}
