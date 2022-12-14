package com.example.pr18k

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class SecondFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    fun setSelectedItem(selectedItem: String?) {
        val view = view?.findViewById<TextView>(R.id.textView)
        view?.text = selectedItem

        if (selectedItem == "Мейн-Кун"){
            view?.text = "Мейн-кун (Maine Coon) – крупная и интересная порода кошек с происхождением, покрытым многими мифами и легендами.\n" +
                    "\n" +
                    "Эти питомцы любимы многим по следующим причинам: им свойственна удивительная сила, и, в свою очередь, мягкий характер и грация. " +
                    "Кошки Мейн-кун имеют необычный окрас, пушистую шерсть и чудесные кисточки на кончиках ушей."
        }
        if (selectedItem == "Шотландская Вислоухая"){
            view?.text = "Шотландская вислоухая кошка (Scottish Fold) – животное, главным экстерьерным признаком которого является особая форма ушей.\n " +
                    "Они загнуты вперед и вниз и по канонам не должны выступать за контур головы.\n " +
                    "Благодаря своему оригинальному внешнему виду представители этой породы пользуются большой популярностью среди любителей кошек по всему миру."
        }
        if (selectedItem == "Британская короткошерстная"){
            view?.text = "Британская короткошерстная кошка относится к числу пород, над которыми природа работала гораздо дольше, чем человек.\n " +
                    "В результате имеем физически развитое, гармонично сложенное животное с легким, уживчивым характером. \n" +
                    "Совместное проживание с ним не доставит владельцам особенных хлопот.\n" +
                    " Британские кошки привлекают спокойным нравом, граничащим с флегматичностью, воспитанностью и невероятно красивой, приятной на ощупь плюшевой шерсткой."
        }
        if (selectedItem == "Мачкин"){
            view?.text = "Манчкин – порода кошек, которая отличается укороченными лапами при сохранении пропорций тела и внешнего вида обычных представителей семейства.\n " +
                    "Особенность развилась в результате природной мутации, поэтому абсолютное большинство животных обладает крепким здоровьем.\n " +
                    "Манчкины подвижны, хорошо уживаются с другими питомцами, добры к детям. "
        }
        if (selectedItem == "Абиссинская"){
            view?.text = "Абиссинская кошка – короткошерстная порода, имеющая древнее происхождение. \n" +
                    "Это очень умные животные, в которых удивительным образом сочетаются величественные повадки, любовь к хозяину и подвижность.\n " +
                    "Они преданы, уравновешены, готовы дарить и получать внимание. Питомцы имеют хорошее здоровье, недороги в содержании."
        }
    }
}