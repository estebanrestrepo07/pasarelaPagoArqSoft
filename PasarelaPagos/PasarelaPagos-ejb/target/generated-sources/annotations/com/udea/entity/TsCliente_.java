package com.udea.entity;

import com.udea.entity.TsTransaccion;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-21T18:43:03")
@StaticMetamodel(TsCliente.class)
public class TsCliente_ { 

    public static volatile SingularAttribute<TsCliente, String> ctEmail;
    public static volatile SingularAttribute<TsCliente, Integer> ctId;
    public static volatile SingularAttribute<TsCliente, String> ctCelular;
    public static volatile SingularAttribute<TsCliente, String> ctNumeroid;
    public static volatile SingularAttribute<TsCliente, String> ctNombre;
    public static volatile CollectionAttribute<TsCliente, TsTransaccion> tsTransaccionCollection;

}