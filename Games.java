import java.util.Scanner;

import java.util.Random;

public class Games {

    private Player us1;
    private Scanner sc;
    private Random rand;
    
    

    
    public Games() {
        sc = new Scanner(System.in);
        rand = new Random();
        startGames();
    }

    private void startGames() {
        System.out.print("\033[H\033[2J");
        System.out.println("-- /======================================================================================================================================================================================================================\
-- ||                                                                                                                                                                                                                    ||
-- ||                                                                                                                                                                                                                    ||
-- ||                                                                                                                                                                                                                    ||
-- ||                                                                                                                                                                                                                    ||
-- ||    _____/\\\\\\\\\______/\\\__________________/\\\\\\\\\\\_____/\\\________/\\\______/\\\\\\\\\______/\\\\\\\\\\\\\________/\\\\\\\\\_________/\\\\\\\\\______/\\\\\\\\\\\\\______________ ___________             ||
-- ||     ___/\\\\\\\\\\\\\___\/\\\________________/\\\/////////\\\__\/\\\_______\/\\\____/\\\\\\\\\\\\\___\/\\\/////////\\\____/\\\\\\\\\\\\\_____/\\\\\\\\\\\\\___\/\\\/////////\\\____________ ___________            ||
-- ||      __/\\\/////////\\\__\/\\\_______________\//\\\______\///___\/\\\_______\/\\\___/\\\/////////\\\__\/\\\_______\/\\\___/\\\/////////\\\___/\\\/////////\\\__\/\\\_______\/\\\____________ ___________           ||
-- ||       _\/\\\_______\/\\\__\/\\\________________\////\\\__________\/\\\\\\\\\\\\\\\__\/\\\_______\/\\\__\/\\\\\\\\\\\\\\___\/\\\_______\/\\\__\/\\\_______\/\\\__\/\\\\\\\\\\\\\\_____________ ___________          ||
-- ||        _\/\\\\\\\\\\\\\\\__\/\\\___________________\////\\\_______\/\\\/////////\\\__\/\\\\\\\\\\\\\\\__\/\\\/////////\\\__\/\\\\\\\\\\\\\\\__\/\\\\\\\\\\\\\\\__\/\\\/////////\\\____________ ___________         ||
-- ||         _\/\\\/////////\\\__\/\\\______________________\////\\\____\/\\\_______\/\\\__\/\\\/////////\\\__\/\\\_______\/\\\__\/\\\/////////\\\__\/\\\/////////\\\__\/\\\_______\/\\\____________ ___________        ||
-- ||          _\/\\\_______\/\\\__\/\\\_______________/\\\______\//\\\___\/\\\_______\/\\\__\/\\\_______\/\\\__\/\\\_______\/\\\__\/\\\_______\/\\\__\/\\\_______\/\\\__\/\\\_______\/\\\____________ ___________       ||
-- ||           _\/\\\_______\/\\\__\/\\\\\\\\\\\\\\\__\///\\\\\\\\\\\/____\/\\\_______\/\\\__\/\\\_______\/\\\__\/\\\\\\\\\\\\\/___\/\\\_______\/\\\__\/\\\_______\/\\\__\/\\\\\\\\\\\\\/_____________ ___________      ||
-- ||            _\///________\///___\///////////////_____\///////////______\///________\///___\///________\///___\/////////////_____\///________\///___\///________\///___\/////////////_______________ ___________     ||
-- ||                                                                                                                                                                                                                    ||
-- ||                                                                                                                                                                                                                    ||
-- ||                                                                                                                                                                                                                    ||
-- ||                                                                                                                                                                                                                    ||
-- \======================================================================================================================================================================================================================/----");
        System.out.println("Enter Your Name: ");
        String playerName = sc.nextLine();
        us1 = new Player(playerName, 100);
        System.out.print("\033[H\033[2J");
        System.out.println("\t\n# Hello " + us1.getName() + "! #");

        
        Boss boss = new Boss();
        Enemy enemy = new Enemy();
        int usdmg = us1.getUsdmg();
        int hp = us1.getHp();
        int heal = us1.getHeal();
        int healtpotion = us1.getHealthpotion();
        int Nsword = us1.getNSword();
        int potiondrop = us1.getPotiondrop();
        int money = us1.getMoney();
        int level = us1.getLevel();
        int expbar = us1.getExpbar();
        int expmax = us1.getExpmax();
        int swordDmg = us1.getSwordDmg();
        int Armor = us1.getArmor();
        int ArmorHp = us1.getArmorHp();
        int Shield = us1.getShield();
        int randmondrop = us1.dropMoney[rand.nextInt(us1.dropMoney.length)];
        int randexp = us1.exp1[rand.nextInt(us1.exp1.length)];

        
               
        while (true) {

            System.out.println("===================================");
            System.out.println("\t# Your Name: "+us1.getName()+" #");
            System.out.println("\t# Your Healh is: "+hp+"!! #");
            System.out.println("\t# Your Shield is: "+Shield+"!!");
            System.out.println("\t# Gold: "+money+" #");
            System.out.println("\t# Level: "+level+" #");
            System.out.println("\t# You have "+expbar+" Experience #");
            System.out.println("===================================");
            System.out.println("\t\n# Pick Your Choice! #");
            System.out.println("\t# 1. Walk #");
            System.out.println("\t# 2. Shop #");
            System.out.println("\t# 3. Inventory #");
            System.out.println("\t# 4. Stats #");
            System.out.println("\t# 5. Boss Arena #");
            System.out.println("\t# 6. Quit #");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                
                case 1:
                int walk = rand.nextInt(2);
                if (walk == 0) {
                    System.out.print("\033[H\033[2J");
                    System.out.println("===================================");
                    System.out.println("===================================");
                    System.out.println("      You explore the cult");
                    System.out.println("===================================");
                }
                else {
                String randomEnemy = enemy.enemies[rand.nextInt(enemy.enemies.length)];
                int randomDmgEn = enemy.maxEnemyAttk[rand.nextInt(enemy.maxEnemyAttk.length)];
                int randomEnhp = enemy.maxEnemyHp[rand.nextInt(enemy.maxEnemyHp.length)];
                
                
                System.out.print("\033[H\033[2J");
                System.out.println("===================================");
                System.out.println("You Encounter: " + randomEnemy);
                    
                loopback: do {
                System.out.println("===================================");
                System.out.println(us1.getName()+" Have "+hp+" HP and "+Shield+" Shield");
                System.out.println(randomEnemy+" Have "+randomEnhp+" HP");
                System.out.println("===================================");
                System.out.println("\t\tchoose option: ");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Use Potion");
                System.out.println("\t3. Run");
                int pick = sc.nextInt();
                switch (pick) {
                    case 1:
                    if (Shield <= 1) {
                    System.out.print("\033[H\033[2J");
                    System.out.println("===================================");
                    System.out.println(">You Attack "+randomEnemy+" for "+usdmg+"Dmg");
                    randomEnhp -= usdmg;
                    System.out.println(">You Receive "+randomDmgEn+" in retaliation!");
                    hp -= randomDmgEn;
                    if (randomEnhp <= 1) {
                    System.out.print("\033[H\033[2J");
                    System.out.println("===================================");
                    System.out.println(">You have defeated "+randomEnemy);
                    System.out.println(">You recieved "+randmondrop+" Gold!");
                    money += randmondrop;
                    System.out.println(">You recieved "+randexp+" Experience!");
                    expbar += randexp;
                    if (expbar >= expmax) {
                        System.out.println(">You Level Up!");
                        level++;
                        usdmg += 2;
                        expmax += 20;
                        expbar = 0;
                    }

                    if (rand.nextInt(100) < potiondrop) {
                        System.out.println(">You get a potion");
                        healtpotion ++;
                    }
                }
                    if (hp <= 0) {
                        System.out.print("\033[H\033[2J");
                        System.out.println("===================================");
                        System.out.println("===================================");
                        System.out.println("  Game Over, You have no HP left");
                        System.out.println("===================================");
                        System.out.println("===================================");
                        return;
                    }
                }else{
                    System.out.print("\033[H\033[2J");
                    System.out.println("===================================");
                    System.out.println(">You Attack "+randomEnemy+" for "+usdmg+"Dmg");
                    randomEnhp -= usdmg;
                    System.out.println(">You Receive "+randomDmgEn+" in retaliation!");
                    Shield -= randomDmgEn;
                }
                    break;
                    case 2:
                    if (healtpotion >= 0) {
                        System.out.print("\033[H\033[2J");
                    System.out.println("===================================");
                    System.out.println(">You heal yourself for "+heal+" HP");
                    System.out.println(">You have "+healtpotion+" potion left");
                    hp += heal;
                    healtpotion --;
                    }else{
                        System.out.print("\033[H\033[2J");
                        System.out.println("===================================");
                        System.out.println(">You failed to heal, \n>you have 0 health potion left");
                    }
                   
                    break;
                    case 3:
                    if (rand.nextBoolean()) {
                        System.out.print("\033[H\033[2J");
                       System.out.println("===================================");
                       System.out.println(">You successfully escaped!!");  
                       break loopback;
                    }else{
                        System.out.print("\033[H\033[2J");
                        System.out.println("===================================");
                        System.out.println(">You failed to escaped!!");
                    }
                    
                }  
                
                
                }while (randomEnhp >= 1);
            }
            break;
                    case 2:
                    System.out.print("\033[H\033[2J");
                    System.out.println("===================================");
                    System.out.println("===================================");
                    System.out.println("\t\tSH0P");
                    System.out.println("===================================");
                    System.out.println("===================================");
                    System.out.println("Choose items below!");
                    System.out.println("1. 5 Potion = 150G");
                    System.out.println("2. normal sword = 200G");
                    System.out.println("3. Armor = 200G");
                    System.out.println("0. Quit Shop");
                    int chs = sc.nextInt();
                    switch (chs) {
                        
                    case 1:
                        if (money >= 150) {
                        System.out.print("\033[H\033[2J");
                        System.out.println("===================================");
                        System.out.println("  You succesfully buy a Potion!");
                        healtpotion += 5;
                        money -= 150;
                        }
                        else {
                        System.out.print("\033[H\033[2J");
                        System.out.println("===================================");
                        System.out.println("\tYou have no Gold");
                    }
                    case 2:
                        if (money >= 200){
                            System.out.print("\033[H\033[2J");
                            System.out.println("===================================");
                            System.out.println(" You Succesfully buy Normal Sword");
                            Nsword +=1 ;
                            money -= 200;
                        }
                    break;
                    case 0: {
                        System.out.print("\033[H\033[2J");
                        System.out.println("===================================");
                        System.out.println("===================================");
                        System.out.println("\t  You quit shop");
                        System.out.println("===================================");
                    }
                    break;
                }
                    case 3:
                    System.out.print("\033[H\033[2J");
                    System.out.println("===================================");
                    System.out.println("===================================");
                    System.out.println("\t\sInventory");
                    System.out.println("You have 5 slot");
                    System.out.println("1. Potion's left "+ healtpotion);
                    System.out.println("2. You have Sword "+Nsword);
                    System.out.println("3. You have Armor");
                    System.out.println("0. Quit the Inventory");
                    int in = sc.nextInt();
                    switch (in) {
                        case 1:
                            if (healtpotion <= 0) {
                                System.out.print("\033[H\033[2J");
                                System.out.println("===================================");
                                System.out.println("You have no Potion Left");
                            }else {
                                System.out.print("\033[H\033[2J");
                                System.out.println("===================================");
                                System.out.println("You Use a potion!");
                                healtpotion-=1;
                                hp += heal;
                            }
                            break;
                        case 2:
                            if (Nsword <= 0) {
                                System.out.print("\033[H\033[2J");
                                System.out.println("===================================");
                                System.out.println("You have no sword!");
                            }else {
                                System.out.print("\033[H\033[2J");
                                System.out.println("===================================");
                                System.out.println("You use the sword!");
                                Nsword -= 1;
                                usdmg += swordDmg;
                            }if (usdmg >= 550) {
                                System.out.print("\033[H\033[2J");
                                System.out.println("===================================");
                                System.out.println("You have max Attack Damage!");
                            }
                            break;
                        case 3:
                            if (Armor <= 0) {
                                System.out.print("\033[H\033[2J");
                                System.out.println("===================================");
                                System.out.println("You have no Armor!");
                            }else {
                                System.out.print("\033[H\033[2J");
                                System.out.println("===================================");
                                System.out.println("You use the Armor!");
                                ArmorHp -= 1;
                                Shield += ArmorHp;
                            }
                        break;
                        case 0:
                             System.out.print("\033[H\033[2J");
                        System.out.println("===================================");
                        System.out.println("===================================");
                        System.out.println("\t  You quit Inventory");
                        System.out.println("===================================");
                        break;
                        default:
                            break;
                    }
                        
                    break;
                    case 4:
                    System.out.print("\033[H\033[2J");
                    System.out.println("===================================");
                    System.out.println("===================================");
                    System.out.println("\t# Stats! #");
                    System.out.println("===================================");
                    System.out.println("===================================");

                    System.out.println("|\tStrength = "+usdmg+"             |");
                    System.out.println("|\t--------------------------|");
                    System.out.println("|\tDefense  = "+Shield+"               |");
                    System.out.println("===================================");
                    
                    break;
                    case 5:
                    if (level <= 9) {
                        System.out.print("\033[H\033[2J");
                        System.out.println("===================================");
                        System.out.println("    You're still low level!!");
                        System.out.println("         Level 10 Needed        ");
                        break;
                    }
                    else{
                        String randomBoss = boss.bosss[rand.nextInt(boss.bosss.length)];
                        int randomBosshp = boss.maxBossHp[rand.nextInt(boss.maxBossHp.length)];
                        int randomBossatk = boss.maxBossAttk[rand.nextInt(boss.maxBossAttk.length)];
                        System.out.print("\033[H\033[2J");
                        System.out.println("You Enter The Dungeun of "+randomBoss);
                        System.out.println("Good Luck!!!");
                    
                    do {
                        System.out.println("===================================");
                        System.out.println(us1.getName()+" Health "+hp);
                        System.out.println("Boss "+randomBoss);
                        System.out.println("===================================");
                        System.out.println("Boss Healt: "+randomBosshp);
                        System.out.println("===================================");
                        System.out.println("\t\n# Pick Your Choice! #");
                        System.out.println("\t1. Attack");
                        System.out.println("\t2. Run");
                        
                        int chose = sc.nextInt();
                        switch (chose) {
                            case 1:
                            System.out.print("\033[H\033[2J");  
                                System.out.println("===================================");
                                System.out.println("You attack "+randomBoss+" For "+us1.usdmg);
                                randomBosshp -= usdmg;
                                System.out.println("===================================");
                                System.out.println("Boss "+randomBoss+" attack you for "+randomBossatk);
                                System.out.println("===================================");
                                hp -= randomBossatk;
                                
                                if (randomBosshp <= 1) {
                                    System.out.print("\033[H\033[2J");
                                    System.out.println("===================================");
                                    System.out.println("===================================");
                                    System.out.println("\tYou Defeat The Boss");
                                    System.out.println("\t\s\sCongratulation");
                                    System.out.println("\tYou finish the game");
                                    System.out.println("===================================");
                                    level++;
                                    money += 1000;
                                    return;
                                }
                                if (hp <= 0) {
                                    System.out.print("\033[H\033[2J");
                                    System.out.println("===================================");
                                    System.out.println("===================================");
                                    System.out.println("You have 0 hp left \nDefeat");
                                    return ;
                                }
                            
                                break;
                            }
                    }while (randomBosshp >= 1);
                        
                }
                    case 6:
                    return;
                    
            }
            
    }
        }
    


    public static void main(String[] args) {
        new Games();
    }

class Player {
    private String name;
    private int hp;
    private int usdmg;
    private int heal;
    private int healtpotion;
    private int potiondrop;
    private int money;
    private int level;
    private int expbar;
    private int expmax;
    private int Nsword;
    private int ArmorHp;
    private int Armor;
    private int swordDmg;
    private int Shield;
    int[] dropMoney = {50,60,70,100};
    int[] exp1 = {15,25,35};
 
    public Player(String name, int hp) {
        this.name = name;
        this.hp = 120;
        this.usdmg = 30;
        this.heal = 30;
        this.healtpotion = 0;
        this.potiondrop = 50;
        this.money = 100;
        this.level = 1;
        this.expbar = 0;
        this.expmax = 100;
        this.Nsword= 0;
        this.Armor = 0;
        this.ArmorHp = 180;
        this.swordDmg = 15;
        this.Shield = 200;
    }
public class wew extends Games{
    String[]inv = new String[money];
    
}   
    public int getShield() {
        return Shield;
    }
    public int getArmorHp(){
        return ArmorHp;
    }
    public int getArmor() {
        return Armor;
    }
    public int getSwordDmg() {
        return swordDmg;
    }
    public int getNSword(){
        return Nsword;
    }
    public int getUsdmg(){
        return usdmg;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getHeal() {
        return heal;
    }
    public int getHealthpotion() {
        return healtpotion;
    }
    public int getPotiondrop() {
        return potiondrop;
    }
    public int getMoney() {
        return money;
    }
    public int getLevel() {
        return level;
    }
    public int getExpbar() {
        return expbar;
    }
    public int getExpmax() {
        return expmax;
    }

}
class Inventory {
     
}

class Enemy {
    public String[] damage;
    String[] enemies = {"Sabyiee", "VonDgreat", "Fortyiee", "TonYooow", "Arbyisstic", "Onii-chan", "TheTwoJames", "PakyMyTomboy"};
    int[] maxEnemyHp = {100,150};
    int[] maxEnemyAttk = {10,15,20};
}

class Boss {
    String[] bosss = {"Alshabaab The Youth", "Jesrel The Pastor"};
    int[] maxBossHp = {500, 600};
    int[] maxBossAttk = {100, 200};
}
}
