package org.glavo.viewer.classfile.datatype;

/**
 * Same as U1, but used as index of ConstantPool.
 */
public final class U1CpIndex extends UInt {

    public U1CpIndex() {
        super(READ_U1, TO_CONST);
    }

}
