import json
import sys
miJSON ={
    "Personajes GOT": [
        {
            "Khaleesi": {
                "Rol":"Daenerys de la tormenta, Madre de Dragones, la que no arde, Rompedora de cadenas, khalesi de los dothraki, reina de los ándalos, rhoynar y los primeros hombres. Señora de los siete reinos y protectora del reino.",
                "Casa": "Targaryen",
                "Familiares": ["Rhaegar Targaryen", "Aerys II Targaryen", "Viserys Targaryen"]
            }
        },
        {
            "Jon Snow (AKA Aegon Targaryren)": {
                "Rol":"Lord Commander (Legitimo heredero al Trono de Hierro)",
                "Casa": "Stark (Targaryen realmente)",
                "Familiares": ["Rob Stark", "Aria Stark", "Sansa Stark"]
            }
        }
    ]
}
print (json.dumps (miJSON))
sys.exit(0)
