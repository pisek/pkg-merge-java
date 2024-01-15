# pkg-merge-linux
Merges PKG files into one proper file.
Used in PS4 package files that are split to 4GB files.

## Usage
Put all `..._<PKG_NUMBER>.pkg` files in one folder.

Run the app with:

`java -jar pkg-merge-java.jar <PKG_DIRECTORY_PATH>`

eg. `java -jar pkg-merge-java.jar C:\myPkgFolder`

App will merge `..._0.pkg`, `..._1.pkg` ... files into `merged.pkg` file.
