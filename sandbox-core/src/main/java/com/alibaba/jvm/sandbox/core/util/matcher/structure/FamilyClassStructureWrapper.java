package com.alibaba.jvm.sandbox.core.util.matcher.structure;

import java.util.Set;

/**
 * @email: changtian@douyu.tv
 * @author: changtian
 * @date: 2019/7/4 21:52
 */
public class FamilyClassStructureWrapper {

    private Set<ClassStructure> familyInterfaceClassStructures;

    private Set<ClassStructure> familyAnnotationTypeClassStructures;

    public Set<ClassStructure> getFamilyInterfaceClassStructures() {
        return familyInterfaceClassStructures;
    }

    public void setFamilyInterfaceClassStructures(Set<ClassStructure> familyInterfaceClassStructures) {
        this.familyInterfaceClassStructures = familyInterfaceClassStructures;
    }

    public Set<ClassStructure> getFamilyAnnotationTypeClassStructures() {
        return familyAnnotationTypeClassStructures;
    }

    public void setFamilyAnnotationTypeClassStructures(Set<ClassStructure> familyAnnotationTypeClassStructures) {
        this.familyAnnotationTypeClassStructures = familyAnnotationTypeClassStructures;
    }

    @Override
    public String toString() {
        return "FamilyClassStructureWrapper{" +
                "familyInterfaceClassStructures=" + familyInterfaceClassStructures +
                ", familyAnnotationTypeClassStructures=" + familyAnnotationTypeClassStructures +
                '}';
    }
}
