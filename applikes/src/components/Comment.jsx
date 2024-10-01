import { ThumbsUp, Trash } from '@phosphor-icons/react'
import styles from './Comment.module.css'
export function Comment(){
    return(
        <div className={styles.comment}>
            <img src="https://github.com/AntonioCavalheiro.png"/>
            <div className={styles.commentBox} >
                <div className={styles.commentContent}>
                    <header>
                        <div className={styles.authorAndTime}>
                            <strong>Antônio Gabriel</strong>
                            <time
                                title="10 de setembro às 9:46" dateTime="2024/09/10 09:46:00"
                                >Há 1h atrás
                            </time>
                        </div>
                        <button title='Excluir comentário' >
                            <Trash size={24}/>
                        </button>
                    </header>
                    <p>Muito bem Antônio, parabéns!!!</p>
                </div>
                <footer>
                    <button>
                        <ThumbsUp size={20}/>
                        Curtir <span>20</span>
                    </button>
                </footer>
            </div>
        </div>
    )
}