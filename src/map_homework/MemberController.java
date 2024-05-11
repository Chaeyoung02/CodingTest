package map_homework;

import java.util.*;

public class MemberController {

    Map<String, Member> map = new HashMap<String, Member>();
    Member m = new Member();
    public boolean joinMember(String id, Member m) {
        if(map.containsKey(id)) {
            return false;
        }else {
            map.put(id, m);

            return true;
        }
    }
    public String login(String id, String password) {
        Set<String> keySet = map.keySet();
        Iterator<String> itrKey = keySet.iterator();
        String idString = null;
        while(itrKey.hasNext()) {
            String key = itrKey.next();
            Member m = map.get(key);
            if(map.containsKey(id)){
                if(password.equals(m.getPassword())) {

                    idString = m.getName();

                }
            }

        }
        if(idString == null) {
            return null;
        }else {
            return idString;
        }

    }
    public boolean changePassword(String id, String oldPw, String newPw) {
        Set<String> keySet = map.keySet();
        Iterator<String> itrKey = keySet.iterator();
        boolean check = false;
        while(itrKey.hasNext()) {
            String key = itrKey.next();
            Member m = map.get(key);
            if(map.containsKey(id)){
                if(m.getPassword().equals(oldPw)) {
                    map.put(key, new Member(newPw,m.getName()));
                    check= true;
                }
            }

        }
        if(check == true) {
            return true;
        }else {
            return false;
        }

    }
    public void changeName(String id, String newName) {
        Set<String> keySet = map.keySet();
        Iterator<String> itrKey = keySet.iterator();

        while(itrKey.hasNext()) {
            String key = itrKey.next();
            Member m = map.get(key);
            if(map.containsKey(id)){
                map.put(key, new Member(m.getPassword(), newName));

            }

        }



    }
	public TreeMap<String, String> sameName(String name){
        TreeMap<String, String> treemap = new TreeMap<>();

        Set<String> keySet2 = map.keySet();

        Iterator<String> itrKey2 = keySet2.iterator();

        while(itrKey2.hasNext()) {
            String key = itrKey2.next();
            Member m = map.get(key);
            if(m.getName().equals(name)){
                treemap.put(key, name);

            }

        }
        return treemap;
	}
}
