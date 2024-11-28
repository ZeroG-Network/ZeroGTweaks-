# ZeroGTweaks

ZeroGTweaks is a Minecraft Forge mod for Minecraft 1.20.1 that enhances gameplay by introducing custom items and blocks with unique models and textures.

## Features
- **Custom Item**: Zero Ausioum (gem/ingot) with a unique texture and model.
- **Custom Block**: Zero Ausioum Ore with layered textures for a vibrant look.
- **Creative Tab**: A dedicated creative tab for mod-specific items and blocks.
- **Localization**: Full English (`en_us`) support for item/block names and creative tab display.

## Directory Structure
```
src/main/
├── java/com/zerogtweaks/
│   ├── ZeroGTweaks.java
│   ├── registry/
│   │   ├── BlockRegistry.java
│   │   └── ItemRegistry.java
├── resources/assets/zerogtweaks/
│   ├── blockstates/
│   │   └── zero_ausioum_ore.json
│   ├── models/
│   │   ├── block/
│   │   │   └── zero_ausioum_ore.json
│   │   └── item/
│   │       ├── zero_ausioum.json
│   │       └── zero_ausioum_ore.json
│   ├── textures/
│   │   ├── block/
│   │   │   ├── ausioumorelayer1.png
│   │   │   ├── ausioumorelayer2.png
│   │   │   └── ausioumorelayer3.png
│   │   └── item/
│   │       └── zero_ausioum.png
│   └── lang/
│       └── en_us.json
└── META-INF/
    └── mods.toml
```

## Getting Started
To build and run the mod locally:
1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/ZeroGTweaks.git
   ```
2. Open the project in an IDE like IntelliJ IDEA or Eclipse.
3. Build the mod using Gradle:
   ```bash
   ./gradlew build
   ```
4. Test it in a Minecraft Forge development environment.

## Contributing
Contributions are welcome! Feel free to fork this repository, make changes, and submit a pull request. For major changes, please open an issue first to discuss what you’d like to change.

## License
This project is licensed under **All rights reserved**. Redistribution or use of this mod is not permitted without prior approval from the author, MrWhiteFlamesYT.
