/*
 * SPDX-License-Identifier: LGPL-2.1-or-later
 * SPDX-FileCopyrightText: Copyright 2021-2023 Fcitx5 for Android Contributors
 */
package org.fcitx.fcitx5.android.ui.main.settings.renshe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.fcitx.fcitx5.android.R
import android.widget.Button
import android.widget.TextView

class RenSheFragment : Fragment() {
    companion object {
        fun newInstance(message: String): RenSheFragment {
            val fragment = RenSheFragment()
            val bundle = Bundle()
            bundle.putString("msg", message)
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_renshe, container, false)

        val textView = view.findViewById<TextView>(R.id.textView)
        val button = view.findViewById<Button>(R.id.button)

        val msg = arguments?.getString("msg") ?: "默认内容"
        textView.text = msg

        button.setOnClickListener {
            textView.text = "按钮点击成功 🎉"
        }

        return view
    }
}
