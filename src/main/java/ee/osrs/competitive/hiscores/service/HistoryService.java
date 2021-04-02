package ee.osrs.competitive.hiscores.service;

import ee.osrs.competitive.hiscores.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class HistoryService {

    @Autowired
    RestService restService;

    private User getUser(String userName) {
        String metaData = restService.getUserMetaData(userName);
        try {
            return new User(metaData, userName);
        } catch (java.lang.NumberFormatException e) {
            System.out.println(e);
            return null;
        }
    }

    //TODO: make API work with any skill not only Defence.
    private void sortUsersByDefence(ArrayList<User> users) {
        users.sort((User user1, User user2) -> {
            if (user1.getDefence() > user2.getDefence())
                return -1;
            if (user1.getDefence() < user2.getDefence())
                return 1;
            if (user1.getDefenceExp() > user2.getDefenceExp())
                return -1;
            if (user1.getDefenceExp() < user2.getDefenceExp())
                return 1;
            return 0;
        });
    }

    private void sortUsersByTotal(ArrayList<User> users) {
        users.sort((User user1, User user2) -> {
            if (user1.getTotalLevel() > user2.getTotalLevel())
                return -1;
            if (user1.getTotalLevel() < user2.getTotalLevel())
                return 1;
            if (user1.getTotalLevelExp() > user2.getTotalLevelExp())
                return -1;
            if (user1.getTotalLevelExp() < user2.getTotalLevelExp())
                return 1;
            return 0;
        });
    }

    //TODO: make API work with any skill not only Defence.
    public String getHiScores(ArrayList<String> names) {
        ArrayList<User> users = new ArrayList<>();
        for (String name: names) {
            User user = getUser(name);
            if (user != null) {
                users.add(getUser(name));
            }
        }
        sortUsersByDefence(users);

        StringBuilder output = new StringBuilder();

        for (int index = 0; index < users.size(); index++) {
            output.append(index + 1).append(". ")
                    .append(users.get(index).getUserName())
                    .append(": lvl: ").append(users.get(index).getDefence())
                    .append(", exp: ").append(users.get(index).getDefenceExp())
                    .append("<br>");
        }

        return output.toString();
    }
}
