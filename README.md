# ZeroGTweaks

ZeroGTweaks is a Minecraft Forge mod for Minecraft 1.20.1 that enhances the game with custom items and blocks, all featuring unique models and textures.

## Features
- **Custom Item**: `Zero Ausioum` (gem/ingot) with a unique texture.
- **Custom Block**: `Zero Ausioum Ore`, featuring layered textures.
- **Creative Tab**: A dedicated creative tab for mod-specific items and blocks.
- **Localization**: English (`en_us`) support for item/block names and creative tab.

## Directory Structure

src/main/ ├── java/com/zerogtweaks/ │ ├── ZeroGTweaks.java │ ├── registry/ │ │ ├── BlockRegistry.java │ │ └── ItemRegistry.java ├── resources/assets/zerogtweaks/ │ ├── blockstates/ │ │ └── zero_ausioum_ore.json │ ├── models/ │ │ ├── block/ │ │ │ └── zero_ausioum_ore.json │ │ └── item/ │ │ ├── zero_ausioum.json │ │ └── zero_ausioum_ore.json │ ├── textures/ │ │ ├── block/ │ │ │ ├── ausioumorelayer1.png │ │ │ ├── ausioumorelayer2.png │ │ │ └── ausioumorelayer3.png │ │ └── item/ │ │ └── zero_ausioum.png │ └── lang/ │ └── en_us.json └── META-INF/ └── mods.toml


## Build and Run
1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/ZeroGTweaks.git
   
