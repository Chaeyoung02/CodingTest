package set_homework;

import java.util.*;

public class LotteryController {
    Set<Lottery> lottery = new HashSet<Lottery>();
    Set<Lottery> win = new HashSet<Lottery>();


    public boolean insertObject(Lottery l) {
        // set은 기본적으로 값이 그냥 알아서 잘 해결
        return lottery.add(l);
    }
    public boolean deleteObject(Lottery l) {

        return lottery.remove(l);
    }
    public Set<Lottery> searchObject(){
        return lottery;
    }
	public Set<Lottery> winObjecSet(){
        Set<Lottery> win = new HashSet<>();
//        int count = 0;

        if(lottery.size() < 4){
            return null;
        }
//        for(Lottery lottery1 : lottery){
//            count++;
//            System.out.println(lottery1);
//        }
//        if(count < 4){
//            return null;
//        }

        List<Lottery> lotteryList = new ArrayList<>(lottery);


        //win.add(lotteryList.get(random));
        while(win.size() < 4){

            int random =(int) (Math.random()* lottery.size());
            Lottery winner = lotteryList.get(random);

            if(!win.contains(winner)){
                win.add(winner);
            }


        } return win;

	}
	public Set<Lottery> sortedWinObject() {
        List<Lottery> sortList = new ArrayList<>(win);

        Collections.sort(sortList, new Comparator<Lottery>() {
            @Override
            public int compare(Lottery o1, Lottery o2) {
                int nameSame = o1.getName().compareTo(o2.getName());
               if(nameSame != 0){
                   return nameSame;
               }
                return o1.getPhone().compareTo(o2.getPhone());
            }
        });
        return new LinkedHashSet<>(sortList);

	}
//	public boolean searchWinnder(Lottery l) {
//
//	}

}
