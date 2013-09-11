

/* First created by JCasGen Wed Sep 11 09:46:59 CST 2013 */
package cmu.lti.hw1_shenwu;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** basic type, in cludes string feature source, and numeric feature confidence. All other typies we use in this project all will be inherited from this type
 * Updated by JCasGen Wed Sep 11 09:48:50 CST 2013
 * XML source: C:/Users/Eltshan/workspace/hw1-shenwu/src/main/resources/hw1-shenwu-typesystem.xml
 * @generated */
public class basicAnnotationType extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(basicAnnotationType.class);
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
  protected basicAnnotationType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public basicAnnotationType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public basicAnnotationType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public basicAnnotationType(JCas jcas, int begin, int end) {
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
  //* Feature: confidence

  /** getter for confidence - gets to be inherited
   * @generated */
  public double getConfidence() {
    if (basicAnnotationType_Type.featOkTst && ((basicAnnotationType_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "cmu.lti.hw1_shenwu.basicAnnotationType");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((basicAnnotationType_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets to be inherited 
   * @generated */
  public void setConfidence(double v) {
    if (basicAnnotationType_Type.featOkTst && ((basicAnnotationType_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "cmu.lti.hw1_shenwu.basicAnnotationType");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((basicAnnotationType_Type)jcasType).casFeatCode_confidence, v);}    
   
    
  //*--------------*
  //* Feature: source

  /** getter for source - gets 
   * @generated */
  public String getSource() {
    if (basicAnnotationType_Type.featOkTst && ((basicAnnotationType_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "cmu.lti.hw1_shenwu.basicAnnotationType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((basicAnnotationType_Type)jcasType).casFeatCode_source);}
    
  /** setter for source - sets  
   * @generated */
  public void setSource(String v) {
    if (basicAnnotationType_Type.featOkTst && ((basicAnnotationType_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "cmu.lti.hw1_shenwu.basicAnnotationType");
    jcasType.ll_cas.ll_setStringValue(addr, ((basicAnnotationType_Type)jcasType).casFeatCode_source, v);}    
  }

    