/*
 *                    BioJava development code
 *
 * This code may be freely distributed and modified under the
 * terms of the GNU Lesser General Public Licence.  This should
 * be distributed with the code.  If you do not have a copy,
 * see:
 *
 *      http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright for this code is held jointly by the individual
 * authors.  These should be listed in @author doc comments.
 *
 * For more information on the BioJava project and its aims,
 * or to join the biojava-l mailing list, visit the home page
 * at:
 *
 *      http://www.biojava.org/
 *
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.biojava3.survival.kaplanmeier.figure;

import org.biojava3.survival.data.WorkSheet;

/**
 *
 * @author willishf at gmail.com
 */
public interface CensorStatusSelect {

    /**
     *
     * @param worksheet
     * @param row
     * @return
     * @throws Exception
     */
    public CensorStatus select(WorkSheet worksheet,String row) throws Exception; 
}