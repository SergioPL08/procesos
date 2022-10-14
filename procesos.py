import json
import sys
miJSON ={
    personajesGOT: {
        "khaleesi": [
                {
            rol: "madre de dragones",
            casa: "targaryen",
            familiares: ["Rhaegar Targaryen", "Aerys II Targaryen","Viserys Targaryen"],
                }
            ],
        
        "jon nieve": 
            [
                {
            rol: "comandante guardia noche",
            casa: "stark",
            familiares: ["Rob Stark", "Aria Stark","Sansa Stark"]   ,
                }
            ]
    }
}
    

print (json.dumps (miJSON ))
sys.exit(0)

    