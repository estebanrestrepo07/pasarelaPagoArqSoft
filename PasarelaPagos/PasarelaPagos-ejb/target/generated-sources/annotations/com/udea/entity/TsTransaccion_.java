package com.udea.entity;

import com.udea.entity.MaFranquicias;
import com.udea.entity.TsCliente;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-21T18:43:03")
@StaticMetamodel(TsTransaccion.class)
public class TsTransaccion_ { 

    public static volatile SingularAttribute<TsTransaccion, Date> tsFecha;
    public static volatile SingularAttribute<TsTransaccion, TsCliente> tsCliente;
    public static volatile SingularAttribute<TsTransaccion, Double> tsMonto;
    public static volatile SingularAttribute<TsTransaccion, Long> tsNumTarjeta;
    public static volatile SingularAttribute<TsTransaccion, Integer> tsId;
    public static volatile SingularAttribute<TsTransaccion, String> tsNombreTitula;
    public static volatile SingularAttribute<TsTransaccion, MaFranquicias> maFranquiciasFqId;

}