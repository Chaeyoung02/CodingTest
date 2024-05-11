package set_homework;
import set_homework.Lottery;

import java.util.*;

public class LotteryController {
    Set<Lottery> lottery = new HashSet<Lottery>();
    Set<Lottery> win = new HashSet<Lottery>();
    Set<Lottery> win2 = new HashSet<Lottery>();

    public boolean insertObject(Lottery l) {
        // set은 기본적으로 값이 그냥 알아서 잘 해결
        return lottery.add(l);
    }
    public boolean deleteObject(Lottery l) {

        //삭제 부분 리스트를 만들어 할당
        Set<Lottery> deleteLottery = new HashSet<Lottery>();
        //삭제하고 싶은 정보를 set에 저장
        boolean check = deleteLottery.add(l);
        System.out.println(check);
        //win Set에 deleteLottery Set 값의 차집합
        win.removeAll(deleteLottery);
        //4개의 값으로 구성된 win은 하나를 지웠기 때문에 size가 3으로 바뀜
        return lottery.remove(l);
    }
    public Set<Lottery> searchObject(){
        return lottery;
    }
    public Set<Lottery> winObjecSet(){
        //추첨자수 4명이상이라는 조건을 위한 조건문
        if(lottery.size() < 4){
            return null;
        }

        List<Lottery> lotteryList = new ArrayList<>(lottery);
        //만약 삭제하여 사이즈가 감소하였다면 while문에 조건문도 할당되어서 돌아감
        while(win.size() < 4){

            int random =(int) (Math.random()* lottery.size());
            Lottery winner = lotteryList.get(random);

            if(!win.contains(winner)){
                win.add(winner);

            }


        } return win;

    }
    public Set<Lottery> sortedWinObject() {
        //TreeSet은 정렬이 되는 친구기때문에 그냥 재 할당 시켜주면 알아서
        //하지만 오류가 발생하는 원인은 lottery에 compareTo()부분을 생성해주고
        //return값 할당해주어야 함

        Set<Lottery> resultList = new TreeSet<Lottery>();
        resultList.addAll(win);
        return resultList;

    }
    public boolean searchWinnder(Lottery l) {
        return win.contains(l);
    }

}