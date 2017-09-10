/*@author Tushar Balarajan
   CSC 201-004N
   Professor Tanes Kanchanawanchai
   Assignment 519


***** BEGIN LICENSE BLOCK *****
        Version: MPL 1.1/GPL 2.0/LGPL 2.1

        The contents of this file are subject to the Mozilla Public License Version
        1.1 (the "License"); you may not use this file except in compliance with
        the License. You may obtain a copy of the License at
        http://www.mozilla.org/MPL/

        Software distributed under the License is distributed on an "AS IS" basis,
        WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
        for the specific language governing rights and limitations under the
        License.

        The Initial Developer of the Original Code is
        Tushar Balarajan.
        Portions created by the Initial Developer are Copyright (C) 2017
        the Initial Developer. All Rights Reserved.

        Contributor(s):

        Alternatively, the contents of this file may be used under the terms of
        either the GNU General Public License Version 2 or later (the "GPL"), or
        the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
        in which case the provisions of the GPL or the LGPL are applicable instead
        of those above. If you wish to allow use of your version of this file only
        under the terms of either the GPL or the LGPL, and not to allow others to
        use your version of this file under the terms of the MPL, indicate your
        decision by deleting the provisions above and replace them with the notice
        and other provisions required by the GPL or the LGPL. If you do not delete
        the provisions above, a recipient may use your version of this file under
        the terms of any one of the MPL, the GPL or the LGPL.

        ***** END LICENSE BLOCK *****
*/
public class Main {

    public static void main(String[] args) {
        makePattern();

    }

    /**
     * makePattern makes a pyramid on powers of 2 using a 3 for loops inside a for loop
     */

    static void makePattern(){
        int startNum = 0, whtSpaceEnd = 7;
        //row determines how high the pyramid will be
        for (int row = 1; row <= 128; row += row) {
            //This creates whitespace on the left side of the and reduces it as the pyramid grows from top to bottom
            for (int whtSpaceBeg = 0; whtSpaceBeg < whtSpaceEnd; whtSpaceBeg++) {
                System.out.print("    ");
            }
            //This determines the left side of the pyramid, increasing 1 to 1+1 to 2+2 4+4 etc. determined by row
            for (int l = 1; l <= row; l += l) {
                System.out.printf("%4d", (l));
            }
            //This determines the right side of the pyramid
            for (int r = startNum; r > 0 ; r /= 2 ) {
                System.out.printf("%4d", (r));
            }
            System.out.println();
            whtSpaceEnd--;
            startNum = row;
        }

    }

}
