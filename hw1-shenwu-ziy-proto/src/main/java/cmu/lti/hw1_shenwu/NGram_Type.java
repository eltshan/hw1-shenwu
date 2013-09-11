
/* First created by JCasGen Wed Sep 11 09:46:59 CST 2013 */
package cmu.lti.hw1_shenwu;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 1,2,or3 gram
 * Updated by JCasGen Wed Sep 11 09:48:50 CST 2013
 * @generated */
public class NGram_Type extends basicAnnotationType_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (NGram_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = NGram_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new NGram(addr, NGram_Type.this);
  			   NGram_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new NGram(addr, NGram_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NGram.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("cmu.lti.hw1_shenwu.NGram");
 
  /** @generated */
  final Feature casFeat_Element;
  /** @generated */
  final int     casFeatCode_Element;
  /** @generated */ 
  public int getElement(int addr) {
        if (featOkTst && casFeat_Element == null)
      jcas.throwFeatMissing("Element", "cmu.lti.hw1_shenwu.NGram");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Element);
  }
  /** @generated */    
  public void setElement(int addr, int v) {
        if (featOkTst && casFeat_Element == null)
      jcas.throwFeatMissing("Element", "cmu.lti.hw1_shenwu.NGram");
    ll_cas.ll_setRefValue(addr, casFeatCode_Element, v);}
    
   /** @generated */
  public int getElement(int addr, int i) {
        if (featOkTst && casFeat_Element == null)
      jcas.throwFeatMissing("Element", "cmu.lti.hw1_shenwu.NGram");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Element), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_Element), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Element), i);
  }
   
  /** @generated */ 
  public void setElement(int addr, int i, int v) {
        if (featOkTst && casFeat_Element == null)
      jcas.throwFeatMissing("Element", "cmu.lti.hw1_shenwu.NGram");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Element), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_Element), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Element), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public NGram_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Element = jcas.getRequiredFeatureDE(casType, "Element", "uima.cas.FSArray", featOkTst);
    casFeatCode_Element  = (null == casFeat_Element) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Element).getCode();

  }
}



    