//Variables
NPC fishingSpot = v.getNpc().findNearest(6488);
int knife_slot = v.getInventory().slot(946);
int sacred_eel_slot = v.getInventory().slot(13339);
int sacred_eel_counter = v.getInventory().count(13339);

//fuck me lol these are testing codes that will blow up
int while_loop_fighter = 0; 

//Methods down below
private void useSpecialAttack() {
    if (v.getCombat().specRemaining(100, 100)) {
        v.getCombat().spec(1);
    }
}

private void enableRunning() {
    if (client.getEnergy() == 10000) {
        v.getWalking().turnRunningOn();
    }
}

private void baitSpot() {
    if (!v.getInventory().inventoryFull() && v.getLocalPlayer().hasAnimation(-1) && !v.getWalking().isMoving()) {
        v.getFishing().bait(fishingSpot);
    }
}
private void convertEelsToScale(){
    if (v.getInventory().inventoryFull() && v.getLocalPlayer().hasAnimation(-1) && !v.getWalking().isMoving()) {   
        int sacred_eel_counter = v.getInventory().count(13339); // Count the eels at the beginning
        while (while_loop_fighter <= sacred_eel_counter) {
            if (sacred_eel_counter != 0) {
                v.invoke("Use","<col=ff9040>Knife</col>",0,25,knife_slot,9764864,false);
                sacred_eel_slot = v.getInventory().slot(13339); //update the slot of the eel
                v.invoke("Use","<col=ff9040>Knife</col><col=ffffff> -> <col=ff9040>Sacred eel</col>",0,58,27,9764864,false);
                while_loop_fighter++;
                sacred_eel_counter = v.getInventory().count(13339); //update the eel counter
            }
        }
    }
    else {
        baitSpot();
    }
}
useSpecialAttack();
enableRunning();
baitSpot();
convertEelsToScale();