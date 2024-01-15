# pkg-merge-linux
Merges PKG files into one proper file.
Used in PS4 package files that are split to 4GB files.

## Usage
Put all `..._<PKG_NUMBER>.pkg` files in one folder.

Run the app with:

`java -jar pkg-merge-java.jar <PKG_DIRECTORY_PATH> [OUTPUT_DIR_OR_OUTPUT_FILE_PATH]`

Example:

`java -jar pkg-merge-java.jar /home/me/myPkgFolder`

will merge `..._0.pkg`, `..._1.pkg` ... files into `/home/me/myPkgFolder/merged.pkg` file

Example 2:

`java -jar pkg-merge-java.jar /home/me/myPkgFolder /home/me/someOtherFolder`

will merge `..._0.pkg`, `..._1.pkg` ... files into `/home/me/someOtherFolder/merged.pkg` file

Example 3:

`java -jar pkg-merge-java.jar /home/me/myPkgFolder /home/me/someOtherFolder/mypkg.pkg`

will merge `..._0.pkg`, `..._1.pkg` ... files into `/home/me/someOtherFolder/mypkg.pkg` file