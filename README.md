## Guide
Gametick: 3
anti-ban delay: 50, 100 (change this to what you want, this will decide the speed your gonna use knife on eel).

# Main requirement:
- Fishing Rod (not oily)
- Bait (normal fishing bait)
- Dramen staff (if coming via fairy ring or coins to charter here)
- A knife (To scale the eels)
- Dragon harpoon (optional, if you comment out my UseSpecialAttack() line in the code.)
- Lightbearer Ring (optional)
- Radda's blessing 3 (optional, but will increase exp and scale per hour.)

# Crucial
- Make sure your last inventory spot is always open for eels that way it will scale the eel like we are doing blood runecrafting zeah fast method.

### Setup
1. Copy the provided Java code into your code editor trigger v4.
2. Save the file with an appropriate name.

### Usage
1. Start the script in the fishing area where you want to fish.
2. Ensure you have the necessary items and equipment equipped for fishing.
3. The script will perform the following actions:

   - Use special attack if enough special energy is available.
   - Enable running if the player's energy is full.
   - Bait the fishing spot if the inventory is not full and the player is not moving.
   - Convert Sacred Eels to Scale if the inventory is full, the player is not moving, and Sacred Eels are present in the inventory. The script will loop through the conversion process until all Sacred Eels are converted.
   - If the inventory is not full or there are no Sacred Eels, the script will continue baiting the fishing spot.

---

**Note**: The information provided above is for reference only. Please ensure that you understand the code and its implications before implementing it in Vswitcher.