%clauses
transporte(roma,20).
transporte(londres,30).
transporte(tunez,10).

alojamiento(roma,hotel,50).
alojamiento(roma,hostal,30).
alojamiento(roma,camping,10).
alojamiento(londres,hotel,60).
alojamiento(londres,hostal,40).
alojamiento(londres,camping,20).
alojamiento(tunez,hotel,40).
alojamiento(tunez,hostal,20).
alojamiento(tunez,camping,5).
%finclauses

multiplicar(P,X,Y):- P is X*Y.
sumar(S,X,Y):- S is X+Y.
menor(X,Y):- X<Y.

viaje(C,S,H,P):- 
    transporte(C, CostoTransporte),
    alojamiento(C, H, CostoAlojamiento),
    CostoTotalAlojamiento is S * CostoAlojamiento,
    P is CostoTransporte + CostoTotalAlojamiento.

viajeeconomico(C,S,H,P,Pmax):- 
    PrecioTotal is viaje(C,S,H,P),
    P =< Pmax.
    
    

    
    
    
    
    