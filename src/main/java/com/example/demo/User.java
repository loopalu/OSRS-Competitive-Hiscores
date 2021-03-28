package com.example.demo;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class User {
    private String userName;
    private int totalLevel;
    private Long totalLevelExp;
    private int attack;
    private int attackExp;
    private int defence;
    private int defenceExp;
    private int strength;
    private int strengthExp;
    private int hitpoints;
    private int hitpointsExp;
    private int ranged;
    private int rangedExp;
    private int prayer;
    private int prayerExp;
    private int magic;
    private int magicExp;
    private int cooking;
    private int cookingExp;
    private int woodCutting;
    private int woodCuttingExp;
    private int fletching;
    private int fletchingExp;
    private int fishing;
    private int fishingExp;
    private int fireMaking;
    private int fireMakingExp;
    private int crafting;
    private int craftingExp;
    private int smithing;
    private int smithingExp;
    private int mining;
    private int miningExp;
    private int herblore;
    private int herbloreExp;
    private int agility;
    private int agilityExp;
    private int thieving;
    private int thievingExp;
    private int slayer;
    private int slayerExp;
    private int farming;
    private int farmingExp;
    private int runeCrafting;
    private int runeCraftingExp;
    private int hunter;
    private int hunterExp;
    private int construction;
    private int constructionExp;
    private int leaguePoints;
    private int bountyHunterHunter;
    private int bountyHunterRogue;
    private int clueScrollsAll;
    private int clueScrollsBeginner;
    private int clueScrollsEasy;
    private int clueScrollsMedium;
    private int clueScrollsHard;
    private int clueScrollsElite;
    private int clueScrollsMaster;
    private int LMSRank;
    private int soulWarsZeal;
    private int abyssalSire;
    private int alchemicalHydra;
    private int barrowsChests;
    private int bryophyta;
    private int callisto;
    private int cerberus;
    private int chambersOfXeric;
    private int chambersOfXericChallengeMode;
    private int chaosElemental;
    private int chaosFanatic;
    private int commanderZilyana;
    private int corporealBeast;
    private int crazyArchaeologist;
    private int dagannothPrime;
    private int dagannothRex;
    private int dagannothSupreme;
    private int derangedArchaeologist;
    private int generalGraardor;
    private int giantMole;
    private int grotesqueGuardians;
    private int hespori;
    private int kalphiteQueen;
    private int kingBlackDragon;
    private int kraken;
    private int kreeArra;
    private int krilTsutsaroth;
    private int mimic;
    private int nightmare;
    private int obor;
    private int sarachnis;
    private int scorpia;
    private int skotizo;
    private int tempoross;
    private int theGauntlet;
    private int theCorruptedGauntlet;
    private int theatreOfBlood;
    private int thermonuclearSmokeDevil;
    private int tzKalZuk;
    private int tzTokJad;
    private int venenatis;
    private int vetion;
    private int vorkath;
    private int wintertodt;
    private int zalcano;
    private int zulrah;

    public User(String metaData, String userName) {
        List<String> statLines = Arrays.asList(metaData.replace("[", "").replace("]", "").split("\n"));
        this.userName = userName;
        this.totalLevel = Integer.parseInt(statLines.get(0).split(",")[1]);
        this.totalLevelExp = Long.parseLong(statLines.get(0).split(",")[2]);
        this.attack = Integer.parseInt(statLines.get(1).split(",")[1]);
        this.attackExp = Integer.parseInt(statLines.get(1).split(",")[2]);
        this.defence = Integer.parseInt(statLines.get(2).split(",")[1]);
        this.defenceExp = Integer.parseInt(statLines.get(2).split(",")[2]);
        this.strength = Integer.parseInt(statLines.get(3).split(",")[1]);
        this.strengthExp = Integer.parseInt(statLines.get(3).split(",")[2]);
        this.hitpoints = Integer.parseInt(statLines.get(4).split(",")[1]);
        this.hitpointsExp = Integer.parseInt(statLines.get(4).split(",")[2]);
        this.ranged = Integer.parseInt(statLines.get(5).split(",")[1]);
        this.rangedExp = Integer.parseInt(statLines.get(5).split(",")[2]);
        this.prayer = Integer.parseInt(statLines.get(6).split(",")[1]);
        this.prayerExp = Integer.parseInt(statLines.get(6).split(",")[2]);
        this.magic = Integer.parseInt(statLines.get(7).split(",")[1]);
        this.magicExp = Integer.parseInt(statLines.get(7).split(",")[2]);
        this.cooking = Integer.parseInt(statLines.get(8).split(",")[1]);
        this.cookingExp = Integer.parseInt(statLines.get(8).split(",")[2]);
        this.woodCutting = Integer.parseInt(statLines.get(9).split(",")[1]);
        this.woodCuttingExp = Integer.parseInt(statLines.get(9).split(",")[2]);
        this.fletching = Integer.parseInt(statLines.get(10).split(",")[1]);
        this.fletchingExp = Integer.parseInt(statLines.get(10).split(",")[2]);
        this.fishing = Integer.parseInt(statLines.get(11).split(",")[1]);
        this.fishingExp = Integer.parseInt(statLines.get(11).split(",")[2]);
        this.fireMaking = Integer.parseInt(statLines.get(12).split(",")[1]);
        this.fireMakingExp = Integer.parseInt(statLines.get(12).split(",")[2]);
        this.crafting = Integer.parseInt(statLines.get(13).split(",")[1]);
        this.craftingExp = Integer.parseInt(statLines.get(13).split(",")[2]);
        this.smithing = Integer.parseInt(statLines.get(14).split(",")[1]);
        this.smithingExp = Integer.parseInt(statLines.get(14).split(",")[2]);
        this.mining = Integer.parseInt(statLines.get(15).split(",")[1]);
        this.miningExp = Integer.parseInt(statLines.get(15).split(",")[2]);
        this.herblore = Integer.parseInt(statLines.get(16).split(",")[1]);
        this.herbloreExp = Integer.parseInt(statLines.get(16).split(",")[2]);
        this.agility = Integer.parseInt(statLines.get(17).split(",")[1]);
        this.agilityExp = Integer.parseInt(statLines.get(17).split(",")[2]);
        this.thieving = Integer.parseInt(statLines.get(18).split(",")[1]);
        this.thievingExp = Integer.parseInt(statLines.get(18).split(",")[2]);
        this.slayer = Integer.parseInt(statLines.get(19).split(",")[1]);
        this.slayerExp = Integer.parseInt(statLines.get(19).split(",")[2]);
        this.farming = Integer.parseInt(statLines.get(20).split(",")[1]);
        this.farmingExp = Integer.parseInt(statLines.get(20).split(",")[2]);
        this.runeCrafting = Integer.parseInt(statLines.get(21).split(",")[1]);
        this.runeCraftingExp = Integer.parseInt(statLines.get(21).split(",")[2]);
        this.hunter = Integer.parseInt(statLines.get(22).split(",")[1]);
        this.hunterExp = Integer.parseInt(statLines.get(22).split(",")[2]);
        this.construction = Integer.parseInt(statLines.get(23).split(",")[1]);
        this.constructionExp = Integer.parseInt(statLines.get(23).split(",")[2]);
        this.leaguePoints = Integer.parseInt(statLines.get(24).split(",")[1]);
        this.bountyHunterHunter = Integer.parseInt(statLines.get(25).split(",")[1]);
        this.bountyHunterRogue = Integer.parseInt(statLines.get(26).split(",")[1]);
        this.clueScrollsAll = Integer.parseInt(statLines.get(27).split(",")[1]);
        this.clueScrollsBeginner = Integer.parseInt(statLines.get(28).split(",")[1]);
        this.clueScrollsEasy = Integer.parseInt(statLines.get(29).split(",")[1]);
        this.clueScrollsMedium = Integer.parseInt(statLines.get(30).split(",")[1]);
        this.clueScrollsHard = Integer.parseInt(statLines.get(31).split(",")[1]);
        this.clueScrollsElite = Integer.parseInt(statLines.get(32).split(",")[1]);
        this.clueScrollsMaster = Integer.parseInt(statLines.get(33).split(",")[1]);
        this.LMSRank = Integer.parseInt(statLines.get(34).split(",")[1]);
        this.soulWarsZeal = Integer.parseInt(statLines.get(35).split(",")[1]);
        this.abyssalSire = Integer.parseInt(statLines.get(36).split(",")[1]);
        this.alchemicalHydra = Integer.parseInt(statLines.get(37).split(",")[1]);
        this.barrowsChests = Integer.parseInt(statLines.get(38).split(",")[1]);
        this.bryophyta = Integer.parseInt(statLines.get(39).split(",")[1]);
        this.callisto = Integer.parseInt(statLines.get(40).split(",")[1]);
        this.cerberus = Integer.parseInt(statLines.get(41).split(",")[1]);
        this.chambersOfXeric = Integer.parseInt(statLines.get(42).split(",")[1]);
        this.chambersOfXericChallengeMode = Integer.parseInt(statLines.get(43).split(",")[1]);
        this.chaosElemental = Integer.parseInt(statLines.get(44).split(",")[1]);
        this.chaosFanatic = Integer.parseInt(statLines.get(45).split(",")[1]);
        this.commanderZilyana = Integer.parseInt(statLines.get(46).split(",")[1]);
        this.corporealBeast = Integer.parseInt(statLines.get(47).split(",")[1]);
        this.crazyArchaeologist = Integer.parseInt(statLines.get(48).split(",")[1]);
        this.dagannothPrime = Integer.parseInt(statLines.get(49).split(",")[1]);
        this.dagannothRex = Integer.parseInt(statLines.get(50).split(",")[1]);
        this.dagannothSupreme = Integer.parseInt(statLines.get(51).split(",")[1]);
        this.derangedArchaeologist = Integer.parseInt(statLines.get(52).split(",")[1]);
        this.generalGraardor = Integer.parseInt(statLines.get(53).split(",")[1]);
        this.giantMole = Integer.parseInt(statLines.get(54).split(",")[1]);
        this.grotesqueGuardians = Integer.parseInt(statLines.get(55).split(",")[1]);
        this.hespori = Integer.parseInt(statLines.get(56).split(",")[1]);
        this.kalphiteQueen = Integer.parseInt(statLines.get(57).split(",")[1]);
        this.kingBlackDragon = Integer.parseInt(statLines.get(58).split(",")[1]);
        this.kraken = Integer.parseInt(statLines.get(59).split(",")[1]);
        this.kreeArra = Integer.parseInt(statLines.get(60).split(",")[1]);
        this.krilTsutsaroth = Integer.parseInt(statLines.get(61).split(",")[1]);
        this.mimic = Integer.parseInt(statLines.get(62).split(",")[1]);
        this.nightmare = Integer.parseInt(statLines.get(63).split(",")[1]);
        this.obor = Integer.parseInt(statLines.get(64).split(",")[1]);
        this.sarachnis = Integer.parseInt(statLines.get(65).split(",")[1]);
        this.scorpia = Integer.parseInt(statLines.get(66).split(",")[1]);
        this.skotizo = Integer.parseInt(statLines.get(67).split(",")[1]);
        this.tempoross = Integer.parseInt(statLines.get(68).split(",")[1]);
        this.theGauntlet = Integer.parseInt(statLines.get(69).split(",")[1]);
        this.theCorruptedGauntlet = Integer.parseInt(statLines.get(70).split(",")[1]);
        this.theatreOfBlood = Integer.parseInt(statLines.get(71).split(",")[1]);
        this.thermonuclearSmokeDevil = Integer.parseInt(statLines.get(72).split(",")[1]);
        this.tzKalZuk = Integer.parseInt(statLines.get(73).split(",")[1]);
        this.tzTokJad = Integer.parseInt(statLines.get(74).split(",")[1]);
        this.venenatis = Integer.parseInt(statLines.get(75).split(",")[1]);
        this.vetion = Integer.parseInt(statLines.get(76).split(",")[1]);
        this.vorkath = Integer.parseInt(statLines.get(77).split(",")[1]);
        this.wintertodt = Integer.parseInt(statLines.get(78).split(",")[1]);
        this.zalcano = Integer.parseInt(statLines.get(79).split(",")[1]);
        this.zulrah = Integer.parseInt(statLines.get(80).split(",")[1]);
    }
}
