package ee.osrs.competitive.hiscores.service;

import ee.osrs.competitive.hiscores.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

@Service
public class HistoryService {

    @Autowired
    RestService restService;

    private User getUser(String userName) {
        String metaData = restService.getUserMetaData(userName);
        try {
            return new User(metaData, userName);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception);
            return null;
        }
    }

    //TODO: make API work with any skill not only Defence.
    public String getHiScores(ArrayList<String> names) {
        TreeMap<Integer, User> users = new TreeMap<>(Comparator.reverseOrder());
        for (String name: names) {
            User user = getUser(name);
            if (user != null) {
                users.put(user.getDefenceExp(), user);
            }
        }
        StringBuilder output = new StringBuilder();

        int index = 0;
        for (Map.Entry<Integer, User> entry : users.entrySet()) {
            output.append(index + 1).append(". ")
                    .append(entry.getValue().getUserName())
                    .append(": lvl: ").append(entry.getValue().getDefence())
                    .append(", exp: ").append(entry.getValue().getDefenceExp())
                    .append("<br>");
            index += 1;
        }

        return output.toString();
    }
}
