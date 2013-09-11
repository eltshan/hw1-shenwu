

/* First created by JCasGen Wed Sep 11 09:46:59 CST 2013 */
package cmu.lti.hw1_shenwu;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** This type will be the annotation of all 3-Grams
 * Updated by JCasGen Wed Sep 11 09:48:50 CST 2013
 * XML source: C:/Users/Eltshan/workspace/hw1-shenwu/src/main/resources/hw1-shenwu-typesystem.xml
 * @generated */
public class TokenTriGram extends basicAnnotationType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TokenTriGram.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected TokenTriGram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TokenTriGram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TokenTriGram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TokenTriGram(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
}

    