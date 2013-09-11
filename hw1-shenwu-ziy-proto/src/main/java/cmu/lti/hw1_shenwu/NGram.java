

/* First created by JCasGen Wed Sep 11 09:46:59 CST 2013 */
package cmu.lti.hw1_shenwu;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** 1,2,or3 gram
 * Updated by JCasGen Wed Sep 11 09:48:50 CST 2013
 * XML source: C:/Users/Eltshan/workspace/hw1-shenwu/src/main/resources/hw1-shenwu-typesystem.xml
 * @generated */
public class NGram extends basicAnnotationType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGram.class);
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
  protected NGram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NGram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NGram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NGram(JCas jcas, int begin, int end) {
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
     
 
    
  //*--------------*
  //* Feature: Element

  /** getter for Element - gets 
   * @generated */
  public FSArray getElement() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_Element == null)
      jcasType.jcas.throwFeatMissing("Element", "cmu.lti.hw1_shenwu.NGram");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_Element)));}
    
  /** setter for Element - sets  
   * @generated */
  public void setElement(FSArray v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_Element == null)
      jcasType.jcas.throwFeatMissing("Element", "cmu.lti.hw1_shenwu.NGram");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGram_Type)jcasType).casFeatCode_Element, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for Element - gets an indexed value - 
   * @generated */
  public Token getElement(int i) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_Element == null)
      jcasType.jcas.throwFeatMissing("Element", "cmu.lti.hw1_shenwu.NGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_Element), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_Element), i)));}

  /** indexed setter for Element - sets an indexed value - 
   * @generated */
  public void setElement(int i, Token v) { 
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_Element == null)
      jcasType.jcas.throwFeatMissing("Element", "cmu.lti.hw1_shenwu.NGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_Element), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_Element), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    