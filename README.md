# pkg-merge-linux
Merges PKG files into one proper file.
Used in PS4 package files that are split to 4GB files.

## Usage
Put all `..._<PKG_NUMBER>.pkg` files in one folder.

Run the app with:

`java -jar pkg-merge-java.jar <PKG_DIRECTORY_PATH> [OUTPUT_DIR_OR_OUTPUT_FILE_PATH]`

eg. `java -jar pkg-merge-java.jar /home/me/myPkgFolder`

App will merge `..._0.pkg`, `..._1.pkg` ... files into `<PKG_DIRECTORY_PATH>/merged.pkg` file.

When used with second parameter, output will be saved to `OUTPUT_DIR_OR_OUTPUT_FILE_PATH`