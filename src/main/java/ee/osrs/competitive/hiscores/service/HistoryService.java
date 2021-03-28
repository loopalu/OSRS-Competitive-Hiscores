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
        return new User(metaData, userName);
    }

    //TODO: make API work with any skill not only Defence.
    private void sortUsersBySkill(ArrayList<User> users) {
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

    //TODO: make API work with any skill not only Defence.
    public String getHiScores(ArrayList<String> names) {
        ArrayList<User> users = new ArrayList<>();
        for (String name: names) {
            users.add(getUser(name));
        }
        sortUsersBySkill(users);

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
