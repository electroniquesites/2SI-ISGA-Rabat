export class Personne {

    private _num : number ;
    private _nom : string ;
    private _prenom : string ;

    public get num(): number {
        return this._num;
    }

    public set num(num: number) {
        this._num = num;
    }

    public get nom(): string {
        return this._nom;
    }

    public set nom(nom: string) {
        this._nom = nom;
    }

    public get prenom(): string {
        return this._prenom;
    }

    public set prenom(prenom: string) {
        this._prenom = prenom;
    }



    constructor(num : number,nom : string,prenom : string){
        this._nom= nom;
        this._prenom= prenom;
        this._num= num;
    }


}
