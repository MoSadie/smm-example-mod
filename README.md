# SMM-Lib Example Mod

An example mod to show how to use [ServerMainMenu-Lib](https://github.com/mosadie/servermainmenu-lib).

You can copy this repository to start your own project using the "Use this template" button!

Easy steps to customize this project:

1) Change the values in [gradle.properties](gradle.properties) (specifically the ones under `Mod Properties`)
2) Replace [the panorama pictures](src/main/resources/assets/smm-lib-example/textures/gui/title/background/normal) with your own. (See [the wiki](https://github.com/MoSadie/ServerMainMenu-Lib/wiki) for information on creating panorama photos from screenshots)
3) Update the [icon](src/main/resources/assets/smm-lib-example/icon.png) with your own
4) Update the fields in [fabric.mod.json](src/main/resources/fabric.mod.json)
5) Rename all the mentions of "SMM-Lib Example" to something else!

For a real-world example of using SSM-Lib, check out [Island Menu](https://github.com/mosadie/island-menu).

The following dependencies are required for this mod:
- [ServerMainMenu-Lib](https://modrinth.com/mod/smm-lib)
- [ModMenu](https://modrinth.com/mod/modmenu)
- [Cloth Config](https://modrinth.com/mod/cloth-config)
- [Fabric API](https://modrinth.com/mod/fabric-api)

In addition, this repository is configured by default to attempt to build every push and attach jars to every release, you can configure those workflows in the [workflows folder](.github/workflows).